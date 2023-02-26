package accounts;

public class Account {
    protected long balance;
    protected String name;

    public Account(String name, long balance) {
        this.balance = balance;
        this.name = name;
    }

    public boolean pay(long amount) {
        return false;
    }

    public boolean add(long amount) {
        return false;
    }

}

