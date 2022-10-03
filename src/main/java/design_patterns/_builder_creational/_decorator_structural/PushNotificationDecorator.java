package design_patterns._builder_creational._decorator_structural;

public class PushNotificationDecorator implements NotificationSenderDecorator {


    private final NotificationSenderDecorator notificationSenderDecorator;

    public PushNotificationDecorator(NotificationSenderDecorator notificationSenderDecorator) {
        this.notificationSenderDecorator = notificationSenderDecorator;
    }


    @Override
    public void send() {
        if(notificationSenderDecorator != null )notificationSenderDecorator.send();
        System.out.println("Sending push notify! Boomm! ");
    }
}
