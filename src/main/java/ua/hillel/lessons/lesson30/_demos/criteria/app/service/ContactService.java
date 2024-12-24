package ua.hillel.lessons.lesson30._demos.criteria.app.service;

import ua.hillel.lessons.lesson30._demos.criteria.app.entity.Contact;
import ua.hillel.lessons.lesson30._demos.criteria.app.entity.ContactMapper;
import ua.hillel.lessons.lesson30._demos.criteria.app.exceptions.ContactException;
import ua.hillel.lessons.lesson30._demos.criteria.app.repository.impl.ContactRepository;
import ua.hillel.lessons.lesson30._demos.criteria.app.utils.AppValidator;
import ua.hillel.lessons.lesson30._demos.criteria.app.utils.Message;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

public class ContactService {

    ContactRepository repository = new ContactRepository();

    public String createContact(Map<String, String> data) {
        Map<String, String> errors =
                AppValidator.validateContactData(data);
        if (!errors.isEmpty()) {
            try {
                throw new ContactException("Check inputs", errors);
            } catch (ContactException e) {
                return e.getErrors(errors);
            }
        }
        return repository.create(new ContactMapper().mapContactData(data));
    }

    public String readContacts() {
        // Отримуємо дані
        Optional<List<Contact>> optional = repository.read();
        // Якщо Optional не містить null, формуємо виведення.
        // Інакше повідомлення про відсутність даних.
        if (optional.isPresent()) {
            // Отримуємо колекцію з Optional
            List<Contact> list = optional.get();
            // Якщо колекція не порожня, формуємо виведення.
            // Інакше повідомлення про відсутність даних.
            if (!list.isEmpty()) {
                AtomicInteger count = new AtomicInteger(0);
                StringBuilder stringBuilder = new StringBuilder();
                list.forEach((contact) ->
                        stringBuilder.append(count.incrementAndGet())
                                .append(") ")
                                .append(contact.toString())
                );
                return "\nCONTACTS:\n" + stringBuilder;
            } else return Message.DATA_ABSENT_MSG.getMessage();
        } else return Message.DATA_ABSENT_MSG.getMessage();
    }

    public String updateContact(Map<String, String> data) {
        Map<String, String> errors =
                AppValidator.validateContactData(data);
        if (!errors.isEmpty()) {
            try {
                throw new ContactException("Check inputs", errors);
            } catch (ContactException e) {
                return e.getErrors(errors);
            }
        }
        return repository.update(new ContactMapper().mapContactData(data));
    }

    public String deleteContact(Map<String, String> data) {
        Map<String, String> errors =
                AppValidator.validateContactData(data);
        if (!errors.isEmpty()) {
            try {
                throw new ContactException("Check inputs", errors);
            } catch (ContactException e) {
                return e.getErrors(errors);
            }
        }
        return repository.delete(new ContactMapper().mapContactData(data).getId());
    }

    public String readContactById(Map<String, String> data) {
        Map<String, String> errors =
                AppValidator.validateContactData(data);
        if (!errors.isEmpty()) {
            try {
                throw new ContactException("Check inputs", errors);
            } catch (ContactException e) {
                return e.getErrors(errors);
            }
        }
        // Отримуємо дані
        Optional<Contact> optional =
                repository.readById(Long.parseLong(data.get("id")));
        // Якщо Optional не містить null, формуємо виведення.
        // Інакше повідомлення про відсутність даних.
        if (optional.isPresent()) {
            // Отримуємо об'єкт з Optional
            Contact contact = optional.get();
            return "\nCONTACT: " + contact + "\n";
        } else return Message.DATA_ABSENT_MSG.getMessage();
    }
}
