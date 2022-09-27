package design_patterns;
import design_patterns._observer.NotificationManager;
import design_patterns._observer.PaymentEvenLogger;
import design_patterns._observer.PaymentListener;
import design_patterns._observer.PaymentManager;

public class Main {

    public static void main(String[] args) {




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
