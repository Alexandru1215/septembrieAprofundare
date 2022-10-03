package exercitii_design_pattern;

public class PayEvent implements PayListener{

    private  void eventPayment (){
        System.out.println("Payment sent.");
    }

    @Override
    public void paymantWereMade() {
        eventPayment();
    }
}
