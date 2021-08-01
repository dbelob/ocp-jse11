package acme.tests.chapter10.test39;

public class StealSecret extends Secret {
    private void sendMail(String secret) {
        // IMPLEMENTATION OMITTED
    }

    @Override
    public void setSecret(String secret) {
        sendMail(secret);

        super.setSecret(secret);
    }
}
