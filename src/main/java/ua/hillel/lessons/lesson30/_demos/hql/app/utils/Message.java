package ua.hillel.lessons.lesson30._demos.hql.app.utils;

public enum Message {

    WRONG_PHONE_MSG("Wrong phone input."),
    WRONG_EMAIL_MSG("Wrong email input."),
    WRONG_ID_MSG("Wrong id input."),
    DATA_ABSENT_MSG("\n>> No data!"),
    DATA_INSERT_MSG("\n>> Created."),
    DATA_UPDATE_MSG("\n>> Updated."),
    DATA_DELETE_MSG("\n>> Deleted."),
    APP_CLOSE_MSG("\n>> App closed."),
    INPUT_REQ_MSG("Input required."),
    INCORRECT_OPTION_MSG(">> Incorrect option! Try again."),
    ID_NO_EXISTS_MSG("\n>> There is no such ID.");

    private final String message;

    Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
