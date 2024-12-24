package ua.hillel.lessons.lesson30._demos.hql.app.repository.impl;

import ua.hillel.lessons.lesson30._demos.hql.app.config.HibernateConfig;
import ua.hillel.lessons.lesson30._demos.hql.app.entity.Contact;
import ua.hillel.lessons.lesson30._demos.hql.app.repository.AppRepository;
import ua.hillel.lessons.lesson30._demos.hql.app.utils.Message;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Optional;

public class ContactRepository implements AppRepository<Contact> {

    @Override
    public String create(Contact contact) {
        Transaction transaction = null;
        try (Session session =
                     HibernateConfig.getSessionFactory().openSession()) {
            // Транзакція стартує
            transaction = session.beginTransaction();
            // HQL-запит.
            // :[parameter name] - іменований параметр (named parameter),
            // двокрапка перед іменем.
            String hql = "INSERT INTO Contact " +
                    "(firstName, lastName, phone, email) " +
                    "VALUES (:firstName, :lastName, :phone, :email)";
            // Створення HQL-запиту
            MutationQuery query = session.createMutationQuery(hql);
            // Формування конкретних значень для певного іменованого параметра
            query.setParameter("firstName", contact.getFirstName());
            query.setParameter("lastName", contact.getLastName());
            query.setParameter("phone", contact.getPhone());
            query.setParameter("email", contact.getEmail());
            // Виконання HQL-запиту
            query.executeUpdate();
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
        try (Session session =
                     HibernateConfig.getSessionFactory().openSession()) {
            Transaction transaction;
            // Транзакція стартує
            transaction = session.beginTransaction();
            // Формування колекції даними з БД через HQL-запит
            List<Contact> list =
                    session.createQuery("FROM Contact", Contact.class)
                            .list();
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
        // Спершу перевіряємо наявність об'єкта в БД за таким id.
        // Якщо ні, повертаємо повідомлення про відсутність таких даних,
        // інакше оновлюємо відповідний об'єкт в БД
        if (readById(contact.getId()).isEmpty()) {
            return Message.DATA_ABSENT_MSG.getMessage();
        } else {
            Transaction transaction = null;
            try (Session session =
                         HibernateConfig.getSessionFactory().openSession()) {
                // Транзакция стартует
                transaction = session.beginTransaction();
                // HQL-запит.
                // :[parameter name] - іменований параметр (named parameter),
                // двокрапка перед іменем.
                String hql = "UPDATE Contact " +
                        "SET firstName = :firstName, lastName = :lastName, " +
                        "phone = :phone, email = :email WHERE id = :id";
                // Створення HQL-запиту
                MutationQuery query = session.createMutationQuery(hql);
                // Формування конкретних значень для певного іменованого параметра
                query.setParameter("firstName", contact.getFirstName());
                query.setParameter("lastName", contact.getLastName());
                query.setParameter("phone", contact.getPhone());
                query.setParameter("email", contact.getEmail());
                query.setParameter("id", contact.getId());
                // Виконання HQL-запиту
                query.executeUpdate();
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
                // HQL-запит.
                // :[parameter name] - іменований параметр (named parameter),
                // двокрапка перед іменем.
                String hql = "DELETE FROM Contact WHERE id = :id";
                // Створення HQL-запиту
                MutationQuery query = session.createMutationQuery(hql);
                // Формування конкретних значень для певного іменованого параметра
                query.setParameter("id", id);
                // Виконання HQL-запиту
                query.executeUpdate();
                // Транзакція виконується
                transaction.commit();
                // Повернення повідомлення при безпомилковому
                // виконанні транзакції
                return Message.DATA_DELETE_MSG.getMessage();
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
    public Optional<Contact> readById(Long id) {
        Transaction transaction = null;
        Optional<Contact> optional;
        try (Session session =
                     HibernateConfig.getSessionFactory().openSession()) {
            // Транзакція стартує
            transaction = session.beginTransaction();
            // HQL-запит.
            // :[parameter name] - іменований параметр (named parameter),
            // двокрапка перед іменем.
            String hql = " FROM Contact c WHERE c.id = :id";
            // Створюємо запит
            Query<Contact> query = session.createQuery(hql, Contact.class);
            query.setParameter("id", id);
            // Намагаємося отримати об'єкт за id
            optional = query.uniqueResultOptional();
            // Транзакція виконується
            transaction.commit();
            // Повернення результату транзакції
            // Повертаємо Optional-контейнер з об'єктом
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
        try (Session session =
                     HibernateConfig.getSessionFactory().openSession()) {
            // Перевірка наявності об'єкту за певним id
            contact = session.get(Contact.class, contact.getId());
            if (contact != null) {
                Query<Contact> query =
                        session.createQuery("FROM Contact", Contact.class);
                query.setMaxResults(1);
                query.getResultList();
            }
            return contact != null;
        }
    }
}
