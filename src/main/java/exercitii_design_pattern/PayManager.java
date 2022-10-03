package exercitii_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class PayManager implements PayListener {

    private final List<PayListener> payListenerList = new ArrayList<>();

    void payIt(){
        payListenerList.forEach(PayListener ::paymantWereMade);
    }
    public  void setRegisterUserforPay(PayListener p){
       payListenerList.add(p);
    }
    public void unRegisterUserforPay(PayListener p){
        payListenerList.remove(p);
    }

    @Override
    public void paymantWereMade() {

    }
}
