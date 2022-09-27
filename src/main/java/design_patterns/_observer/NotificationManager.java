package design_patterns._observer;

public class NotificationManager implements PaymentListener {

                // putem sa o punet privat si sa o chemam din paymentMAde
    private void sendNotification(){
        System.out.println("Notification send.");
    }

    @Override
    public void paymentMade() {
     sendNotification();

    }
}
