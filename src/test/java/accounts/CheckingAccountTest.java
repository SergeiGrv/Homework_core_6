package accounts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckingAccountTest {

    CheckingAccount checkingAccount = new CheckingAccount("Petya", 10000);

    @Test
    void checkingAccount_pay_test() {
        boolean result = true;
        long amount = 9000;

        Assertions.assertEquals(result, checkingAccount.pay(amount));
        Assertions.assertNotNull(amount);
    }
}