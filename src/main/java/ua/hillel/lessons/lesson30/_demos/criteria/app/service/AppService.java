package ua.hillel.lessons.lesson30._demos.criteria.app.service;

import ua.hillel.lessons.lesson30._demos.criteria.app.controller.ContactController;
import ua.hillel.lessons.lesson30._demos.criteria.app.exceptions.OptionException;
import ua.hillel.lessons.lesson30._demos.criteria.app.utils.AppStarter;
import ua.hillel.lessons.lesson30._demos.criteria.app.utils.Message;
import ua.hillel.lessons.lesson30._demos.criteria.app.view.AppView;

public class AppService {

    ContactController controller = new ContactController();

    public void filterChoice(int choice) {
        switch (choice) {
            case 1 -> controller.createContact();
            case 2 -> controller.readContacts();
            case 3 -> controller.updateContact();
            case 4 -> controller.deleteContact();
            case 5 -> controller.readContactById();
            case 0 -> new AppView().getOutput(Integer.toString(choice));
            default -> {
                try {
                    throw new OptionException(Message.INCORRECT_OPTION_MSG.getMessage());
                } catch (OptionException e) {
                    new AppView().getOutput(e.getMessage());
                    AppStarter.startApp();
                }
            }
        }
    }
}
