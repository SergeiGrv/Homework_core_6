package clients;

import accounts.Account;

public class Client {
    protected String name;
    protected Account[] accounts;

    public Client(String name, int maxAccounts) {
        this.name = name;
        this.accounts = new Account[maxAccounts];
    }

    public void add(Account account) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = account;
                return;
            }
        }
        System.out.println("Мест для добавления нового счёта нет! :(");
    }

    public boolean pay(int amount) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != null && accounts[i].pay(amount)) {
                System.out.println("Платеж прошел!");
                return true;
            }
        }
        System.out.println("Денег нет!");
        return false;
    }
}
