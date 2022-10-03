package exercitii_design_pattern;

public class MyMain {
    public static void main(String[] args) {

/*
        PayManager pm = new PayManager();      // managerul

        pm.setRegisterUserforPay(() -> System.out.println("Boom"));

        PayListener p1 = new PayEvent();
        pm.setRegisterUserforPay(p1);             // persoana 1

        PayListener p2 = new PayEvent();
        pm.setRegisterUserforPay(p2);             // persoana 2

        PayListener p3 = new PayEvent();
        pm.setRegisterUserforPay(p3);          // persoana 3

        pm.payIt();                            // au fost anuntati ca plata a fost trimisa

        pm.unRegisterUserforPay(p2);                   // persoana 2 nu mai este subscriber la metoda asta
        pm.payIt();
*/

        System.out.println('\n'+"*************************");
    NotDeco nd1 = new EmailDeco(null);
    NotDeco nd2 =  new PushDeco(null);
        nd1.send();
        nd2.send();
        System.out.println('\n'+"*************************");

        NotDeco nd3 = new PushDeco(new EmailDeco(new SMSDeco(new SMSDeco(new SMSDeco(new SMSDeco(new SMSDeco(null)))))));

        nd3.send();


    }
}
