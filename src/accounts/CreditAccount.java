package accounts;

public class CreditAccount extends Account {
    private long balance;

    public CreditAccount(String name, long balance) {
        super(name, balance);
        this.balance = getBalance();
    }

    public void setBalance(long balance) {
        if (balance > 0) {
            System.out.println("Баланс не может быть положительным!");
            return;
        }
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }


    @Override
    public boolean pay(long amount) {
        balance -= amount;
        return true;
    }

    @Override
    public boolean add(long amount) {
        if (amount > 0 && (balance + amount) <= 0) {
            balance += amount;
            return true;
        } else {
            return false;
        }
    }
}
