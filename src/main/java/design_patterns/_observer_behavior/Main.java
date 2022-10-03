package design_patterns._observer_behavior;
import design_patterns._observer_behavior.PaymentEvenLogger;
import design_patterns._observer_behavior.PaymentListener;
import design_patterns._observer_behavior.PaymentManager;

public class Main {

    public static void main(String[] args){




        PaymentManager paymentManager = new PaymentManager();
//lambda expression

        paymentManager.registerPaymentListener(()->System.out.println(":)"));


        PaymentListener p2 =  new PaymentEvenLogger();
        paymentManager.registerPaymentListener(p2);
      //  paymentManager.registerPaymentListener(e-> {
            System.out.println(":)");
     //       e.getPaymentSubject().unregisterPaymentLogger(this);
     //   });

        PaymentListener p3 = new PaymentEvenLogger();
        paymentManager.registerPaymentListener(p3);
        PaymentListener p4 = new PaymentEvenLogger();
        paymentManager.registerPaymentListener(p4);

        paymentManager.pay();
        paymentManager.unregisterPaymentListener(p2);
        paymentManager.pay();



    }
}
