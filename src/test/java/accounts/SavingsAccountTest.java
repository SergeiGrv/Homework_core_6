package accounts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SavingsAccountTest {

    SavingsAccount savingsAccount = new SavingsAccount("Vasya", 10000, 3000);

    @Test
    void savingsAccount_pay_test() {
        long amount = 7000;

        Assertions.assertEquals(true, savingsAccount.pay(amount));
        Assertions.assertFalse(amount > 0);
    }
}