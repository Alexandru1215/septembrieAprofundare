package design_patterns._observer_behavior;

public class PaymentEvenLogger implements PaymentListener{

   private void logEven(){
        System.out.println("Payment received.");
    }

    @Override
    public void paymentMade() {
        logEven();
    }
}
