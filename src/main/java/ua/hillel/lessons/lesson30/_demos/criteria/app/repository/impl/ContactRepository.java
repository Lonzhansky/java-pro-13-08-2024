package ua.hillel.lessons.lesson30._demos.criteria.app.repository.impl;

import jakarta.persistence.criteria.*;
import ua.hillel.lessons.lesson30._demos.criteria.app.config.HibernateConfig;
import ua.hillel.lessons.lesson30._demos.criteria.app.entity.Contact;
import ua.hillel.lessons.lesson30._demos.criteria.app.repository.AppRepository;
import ua.hillel.lessons.lesson30._demos.criteria.app.utils.Message;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Optional;

public class ContactRepository implements AppRepository<Contact> {

    @Override
    public String create(Contact contact) {
        Transaction transaction = null;
        try (Session session = HibernateConfig.getSessionFactory().openSession()) {
            // Транзакція стартує
            transaction = session.beginTransaction();
            // Зберігаємо сутність у БД
            session.persist(contact);
            // Транзакція виконується
            transaction.commit();
            // Повернення повідомлення при безпомилковому
            // виконанні транзакції
            return Message.DATA_INSERT_MSG.getMessage();
        } catch (Exception e) {
            if (transaction != null) {
                // Відкочення поточної транзакції ресурсу
                transaction.rollback();
            }
            // Повернення повідомлення про помилку роботи з БД
            return e.getMessage();
        }
    }

    @Override
    public Optional<List<Contact>> read() {
        try (Session session = HibernateConfig.getSessionFactory().openSession()) {
            Transaction transaction;
            // Транзакція стартує
            transaction = session.beginTransaction();
            // Отримуємо данні з БД (розгорнутий варіант коду)
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<Contact> cq = cb.createQuery(Contact.class);
            Root<Contact> root = cq.from(Contact.class);
            cq.select(root);
            Query<Contact> query = session.createQuery(cq);
            List<Contact> list = query.getResultList();
            // Отримуємо данні з БД (скорочений варіант коду)
//            CriteriaBuilder cb = session.getCriteriaBuilder();
//            CriteriaQuery<Contact> cq = cb.createQuery(Contact.class);
//            cq.from(Contact.class);
//            List<Contact> list = session.createQuery(cq).getResultList();
            // Транзакція виконується
            transaction.commit();
            // Повернення результату транзакції
            // Повертаємо Optional-контейнер з колецією даних
            return Optional.of(list);
        } catch (Exception e) {
            // Якщо помилка повертаємо порожній Optional-контейнер
            return Optional.empty();
        }
    }

    @Override
    public String update(Contact contact) {
        // Спершу перевіряємо наявність такого id в БД.
        // Якщо ні, повертаємо повідомлення про відсутність таких даних,
        // інакше оновлюємо відповідний об'єкт в БД
        if (!isEntityWithSuchIdExists(contact)) {
            return Message.DATA_ABSENT_MSG.getMessage();
        } else {
            Transaction transaction = null;
            try (Session session =
                         HibernateConfig.getSessionFactory().openSession()) {
                // Транзакція стартує
                transaction = session.beginTransaction();
                // Оновлення об'єкту
                CriteriaBuilder cb = session.getCriteriaBuilder();
                CriteriaUpdate<Contact> cu = cb.createCriteriaUpdate(Contact.class);
                Root<Contact> root = cu.from(Contact.class);
                cu.set("firstName", contact.getFirstName());
                cu.set("lastName", contact.getLastName());
                cu.set("phone", contact.getPhone());
                cu.set("email", contact.getEmail());
                cu.where(cb.equal(root.get("id"), contact.getId()));
                session.createMutationQuery(cu).executeUpdate();
                // Транзакція виконується
                transaction.commit();
                // Повернення повідомлення при безпомилковому
                // виконанні транзакції
                return Message.DATA_UPDATE_MSG.getMessage();
            } catch (Exception e) {
                if (transaction != null) {
                    // Відкочення поточної транзакції ресурсу
                    transaction.rollback();
                }
                // Повернення повідомлення про помилку роботи з БД
                return e.getMessage();
            }
        }
    }

    @Override
    public String delete(Long id) {
        // Спершу перевіряємо наявність об'єкта в БД за таким id.
        // Якщо ні, повертаємо повідомлення про відсутність таких даних,
        // інакше видаляємо відповідний об'єкт із БД
        if (readById(id).isEmpty()) {
            return Message.DATA_ABSENT_MSG.getMessage();
        } else {
            Transaction transaction = null;
            try (Session session =
                         HibernateConfig.getSessionFactory().openSession()) {
                // Транзакція стартує
                transaction = session.beginTransaction();
                // Видалення об'єкту за певним id
                CriteriaBuilder cb = session.getCriteriaBuilder();
                CriteriaDelete<Contact> cd = cb.createCriteriaDelete(Contact.class);
                Root<Contact> root = cd.from(Contact.class);
                cd.where(cb.equal(root.get("id"), id));
                session.createMutationQuery(cd).executeUpdate();
                // Транзакція виконується
                transaction.commit();
                // Повернення повідомлення при безпомилковому
                // виконанні транзакції
                return Message.DATA_DELETE_MSG.getMessage();
            } catch (Exception e) {
                // Відкочення поточної транзакції ресурсу
                if (transaction != null) {
                    transaction.rollback();
                }
                // Повернення повідомлення про помилку роботи з БД
                return e.getMessage();
            }
        }
    }

    @Override
    public Optional<Contact> readById(Long id) {
        Transaction transaction = null;
        Optional<Contact> optional;
        try (Session session = HibernateConfig.getSessionFactory().openSession()) {
            // Транзакція стартує
            transaction = session.beginTransaction();
            // Отримання об'єкту з БД за певним id
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<Contact> cq = cb.createQuery(Contact.class);
            Root<Contact> root = cq.from(Contact.class);
            cq.select(root).where(cb.equal(root.get("id"), id));
            Query<Contact> query = session.createQuery(cq);
            optional = query.uniqueResultOptional();
            // Транзакція виконується
            transaction.commit();
            // Повернення результату HQL-запиту
            // Повертаємо Optional-контейнер з колецією даних
            return optional;
        } catch (Exception e) {
            if (transaction != null) {
                // Відкочення поточної транзакції ресурсу
                transaction.rollback();
            }
            // Якщо помилка повертаємо порожній Optional-контейнер
            return Optional.empty();
        }
    }

    // Перевірка наявності об'єкту/сутності за певним id у БД
    private boolean isEntityWithSuchIdExists(Contact contact) {
        try (Session session = HibernateConfig.getSessionFactory().openSession()) {
            contact = session.get(Contact.class, contact.getId());
            if (contact != null) {
                CriteriaBuilder cb = session.getCriteriaBuilder();
                CriteriaQuery<Contact> cq = cb.createQuery(Contact.class);
                cq.from(Contact.class);
                session.createQuery(cq).setMaxResults(1);
            }
            return contact != null;
        }
    }

}
