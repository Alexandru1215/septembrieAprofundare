package design_patterns._observer_behavior;


import java.util.ArrayList;
import java.util.List;

public class PaymentManager implements PaymentSubject {

    private final List<PaymentListener> paymentListeners = new ArrayList<>();



    public void pay() { // --> Notify some payment Lsitener
        // do smth
       // PaymentEvent e =  new PaymentEvent(this);
        //paymentListeners.forEach(p->p.paymentMade());            // varianta 1
        paymentListeners.forEach(PaymentListener::paymentMade);    // varianta 2
    }

    public void registerPaymentListener(PaymentListener p ){
        paymentListeners.add(p);
    }
    public  void unregisterPaymentListener(PaymentListener p){
        paymentListeners.remove(p);
    }

    @Override
    public void unregistredPaymentListner(PaymentListener p) {

    }
}
