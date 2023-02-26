package accounts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditAccountTest {

    CreditAccount creditAccount = new CreditAccount("Kolya", -5000);

    @Test
    void creditAccount_add_test() {
        boolean result = true;
        long amount = 10000;

        Assertions.assertEquals(result, creditAccount.add(amount));

    }
}