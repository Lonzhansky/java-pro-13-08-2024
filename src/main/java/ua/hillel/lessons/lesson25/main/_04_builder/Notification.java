package ua.hillel.lessons.lesson25.main._04_builder;

public class Notification {

    private String recipient;
    private String title;
    private String body;

    private Notification(Builder builder) {
        this.recipient = builder.recipient;
        this.title = builder.title;
        this.body = builder.body;
    }

    @Override
    public String toString() {
        return "Notification to " + recipient + ": " + title + " - " + body;
    }

    public static class Builder {
        private String recipient;
        private String title;
        private String body;

        public Builder setRecipient(String recipient) {
            this.recipient = recipient;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setBody(String body) {
            this.body = body;
            return this;
        }

        public Notification build() {
            return new Notification(this);
        }

    }
}
