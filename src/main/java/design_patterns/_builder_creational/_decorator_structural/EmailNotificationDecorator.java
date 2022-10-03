package design_patterns._builder_creational._decorator_structural;

public class EmailNotificationDecorator implements NotificationSenderDecorator {


    private final NotificationSenderDecorator notificationSenderDecorator;



    public EmailNotificationDecorator(NotificationSenderDecorator notificationSenderDecorator) {
        this.notificationSenderDecorator = notificationSenderDecorator;
    }

    @Override
    public void send() {
        if(notificationSenderDecorator != null) notificationSenderDecorator.send();

        System.out.println("Sending e-mail. Pew pew ! ");
    }
}
