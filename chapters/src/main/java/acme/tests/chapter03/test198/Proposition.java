package acme.tests.chapter03.test198;

public enum Proposition {
    TRUE(1) { public String getNickName() { return "RIGHT"; }},
    FALSE(2) { public String getNickName() { return "WRONG"; }},
    UNKNOWN(3) { public String getNickName() { return "LOST"; }};
    public int value;
    Proposition(int value) {
        this.value = value;
    }
    public int getValue() {
        return this.value;
    }
    protected abstract String getNickName();
    }
