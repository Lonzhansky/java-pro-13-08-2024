package ua.hillel.lessons.lesson30._demos.criteria.app.entity;

import java.util.Map;

public class ContactMapper {

    public Contact mapContactData(Map<String, String> data) {
        Contact contact = new Contact();
        if (data.containsKey("id"))
            contact.setId(Long.parseLong(data.get("id")));
        if (data.containsKey("first_name"))
            contact.setFirstName(data.get("first_name"));
        if (data.containsKey("last_name"))
            contact.setLastName(data.get("last_name"));
        if (data.containsKey("phone"))
            contact.setPhone(data.get("phone"));
        if (data.containsKey("email"))
            contact.setEmail(data.get("email"));
        return contact;
    }
}
