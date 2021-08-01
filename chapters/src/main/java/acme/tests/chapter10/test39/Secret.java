package acme.tests.chapter10.test39;

public class Secret {
    private String mySecret;
    public void setSecret(String secret) {
        mySecret = secret;
    }
    public void printSecret() {
        throw new UnsupportedOperationException("Nope!");
    }
    private void saveToDisk() {
        // IMPLEMENTATION OMITTED
    }
}
