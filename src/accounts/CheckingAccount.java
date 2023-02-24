package accounts;

public class CheckingAccount extends Account {

    public CheckingAccount(String name, long balance) {
        super(name, balance);
    }

    @Override
    public boolean pay(long amount) {
        int MIN_BALANCE = 0;
        if (amount > 0 && (balance - amount) >= MIN_BALANCE) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean add(long amount) {
        balance += amount;
        return true;
    }
}
