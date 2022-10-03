package exercitii_design_pattern;

public class PayNotification implements PayListener {

    private void sendNotify(){
        System.out.println("Notification send.");
    }

    @Override
    public void paymantWereMade() {
     sendNotify();
    }
}
