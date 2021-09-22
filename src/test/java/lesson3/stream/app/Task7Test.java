package lesson3.stream.app;

import com.google.gson.reflect.TypeToken;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static lesson3.stream.app.Program.fromJsonFileToObjectsList;
import static lesson3.stream.app.Task7.calcSumOfCanceledTransOnNonEmptyAccounts;
import static org.junit.jupiter.api.Assertions.*;

class Task7Test {

    @Test
    void calcSumOfCanceledTransOnNonEmptyAccountsTest() throws IOException {
        List<Account> accounts = fromJsonFileToObjectsList("src/main/resources/accounts.json",
                new TypeToken<List<Account>>(){}.getType());

        assertEquals(10000, calcSumOfCanceledTransOnNonEmptyAccounts(accounts));
        assertEquals(-1, calcSumOfCanceledTransOnNonEmptyAccounts(new ArrayList<>()));
    }
}