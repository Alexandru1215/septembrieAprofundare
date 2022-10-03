package exercitii_design_pattern;

public class SMSDeco implements  NotDeco{

    private final NotDeco notDeco;

    public SMSDeco(NotDeco notDeco) {
        this.notDeco = notDeco;
    }

    @Override
    public void send() {
        if(notDeco != null ) notDeco.send();
        System.out.println("Send SMS!");
    }
}
