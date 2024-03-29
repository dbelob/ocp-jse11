package acme.enthuware.standard_tests.test2.test68;

interface Account{
    public default String getId(){
        return "0000";
    }
}

interface PremiumAccount extends Account{
    public String getId();
}

public class BankAccount implements PremiumAccount{
    public static void main(String[] args) {
        Account acct = new BankAccount();
        System.out.println(acct.getId());
    }

    @Override
    public String getId() {
        return "42";
    }
}
