package ObserverPattern.StoreExample;

public class EmailMsgListener {

    private final String email;

    public EmailMsgListener(String email) {
        this.email = email;
    }

    public void update() {
        // Actually send the mail
    }

}
