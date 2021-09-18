package lesson3.part1.app;

import com.google.gson.reflect.TypeToken;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static lesson3.part1.app.Program.fromJsonFileToObjectsList;
import static lesson3.part1.app.Task6.calcNumberOfEmployees;
import static org.junit.jupiter.api.Assertions.*;

class Task6Test {

    @Test
    void calcNumberOfEmployeesTest() throws IOException {
        List<Department> departments = fromJsonFileToObjectsList("src/main/resources/departments.json",
                new TypeToken<List<Department>>(){}.getType());

        assertEquals(1L, calcNumberOfEmployees(departments, 20000L));
        assertEquals(2L, calcNumberOfEmployees(departments, 10000L));
    }
}