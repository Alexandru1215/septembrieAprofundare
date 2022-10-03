package design_patterns._builder_creational._decorator_structural;

public class DecoratorMain {
    public static void main(String[] args) {

        NotificationSenderDecorator n1 = new EmailNotificationDecorator(null);
        NotificationSenderDecorator n2 = new EmailNotificationDecorator(new SMSSendNotificationDecorator(null));
        NotificationSenderDecorator n3 = new SMSSendNotificationDecorator(null);
        NotificationSenderDecorator n4 = new SMSSendNotificationDecorator(new EmailNotificationDecorator(new PushNotificationDecorator(null)));
        NotificationSenderDecorator n5 = new SMSSendNotificationDecorator(new SMSSendNotificationDecorator(new SMSSendNotificationDecorator(new SMSSendNotificationDecorator(null))));
        NotificationSenderDecorator n6 =
                new SMSSendNotificationDecorator(
                        new EmailNotificationDecorator(
                                new PushNotificationDecorator(
                                        new SMSSendNotificationDecorator(
                                                new SMSSendNotificationDecorator(null)
                                        )
                                )
                        )
                );


        n1.send();
        System.out.println('\n');
        n2.send();
        System.out.println('\n');
        n3.send();
        System.out.println('\n');
        n4.send();
        System.out.println('\n');
        n5.send();
        System.out.println('\n');
        n6.send();

    }

}
