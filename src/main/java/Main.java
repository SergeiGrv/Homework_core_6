import accounts.Account;
import accounts.SavingsAccount;
import clients.Client;


public class Main {
    public static void main(String[] args) {
        Client client = new Client(" ", 5);
        client.add(new Account("Petya", 1000));
        client.add(new Account("Kolya", 3000));
        client.add(new SavingsAccount("Olga", 50000, 1500));
        client.pay(700);
    }
}
