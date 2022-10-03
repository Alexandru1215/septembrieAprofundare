package exercitii_design_pattern;

public class EmailDeco implements NotDeco{

    private final NotDeco notDeco;

    public EmailDeco(NotDeco notDeco) {
        this.notDeco = notDeco;
    }

    @Override
    public void send() {
        if(notDeco != null) notDeco.send();
        System.out.println("Send E-mail!");
    }
}
