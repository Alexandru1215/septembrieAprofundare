package exercitii_design_pattern;

public class PushDeco implements NotDeco {

    private final NotDeco notDeco;

    public PushDeco(NotDeco notDeco) {
        this.notDeco = notDeco;
    }


    @Override
    public void send() {
        if (notDeco != null) notDeco.send();
        System.out.println("Push Push!");
    }
}
