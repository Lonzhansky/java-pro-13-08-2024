package ua.hillel.lessons.lesson30._demos.criteria.app.controller;

import ua.hillel.lessons.lesson30._demos.criteria.app.service.ContactService;
import ua.hillel.lessons.lesson30._demos.criteria.app.utils.AppStarter;
import ua.hillel.lessons.lesson30._demos.criteria.app.view.*;

public class ContactController {

    ContactService service = new ContactService();

    public void createContact() {
        ContactCreateView createView = new ContactCreateView();
        createView.getOutput(service.createContact(createView.getData()));
        AppStarter.startApp();
    }

    public void readContacts() {
        ContactReadView readView = new ContactReadView();
        readView.getOutput(service.readContacts());
        AppStarter.startApp();
    }

    public void updateContact() {
        ContactUpdateView updateView = new ContactUpdateView();
        updateView.getOutput(service.updateContact(updateView.getData()));
        AppStarter.startApp();
    }

    public void deleteContact() {
        ContactDeleteView deleteView = new ContactDeleteView();
        deleteView.getOutput(service.deleteContact(deleteView.getData()));
        AppStarter.startApp();
    }

    public void readContactById() {
        ContactReadByIdView readByIdView = new ContactReadByIdView();
        readByIdView.getOutput(service.readContactById(readByIdView.getData()));
        AppStarter.startApp();
    }
}
