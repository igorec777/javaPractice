package lesson3.app;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static lesson3.app.Task6.calcNumberOfEmployees;
import static lesson3.app.Task7.calcSumOfCanceledTransOnNonEmptyAccounts;
import static lesson3.task1.Task1.isPrime;
import static lesson3.task2.Task2.createBadWordsDetectingStream;
import static lesson3.task3.Task3.createFilteringStream;
import static lesson3.task4.Task4.factorial;
import static lesson3.task5.Task5.sumOfOddNumbersInRange;


public class Program {

    public static void main(String ... args) throws IOException {

        System.out.println("TASK 1:");
        System.out.println(capitalizeFirstLetter(Boolean.toString(isPrime(4))));

        System.out.println("TASK 2:");
        String text = "Proin elementum sem sit amet purus sem tempor sodales";
        List<String> badWords = Arrays.asList("tempor", "sem", "elementum", "Lorem", "ipsum");
        System.out.println(createBadWordsDetectingStream(text, badWords).collect(Collectors.toList()));

        System.out.println("TASK 3:");
        int[] numbers = {1, 2, 3, 4};

        IntStream evenNums = IntStream.of(numbers).filter(n -> n % 2 == 0);
        IntStream oddNums = IntStream.of(numbers).filter(n -> n % 2 != 0);

        List<Integer> res = createFilteringStream(evenNums, oddNums)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(res);

        System.out.println("TASK 4:");
        System.out.println(factorial(7));

        System.out.println("TASK 5:");
        System.out.println(sumOfOddNumbersInRange(3, 10));

        System.out.println("TASK 6:");
        List<Department> departments = fromJsonFileToObjectsList("src/departmentsJson.txt",
                new TypeToken<List<Department>>(){}.getType());
        System.out.println(calcNumberOfEmployees(departments, 20000));


        System.out.println("TASK 7:");
        List<Account> accounts = fromJsonFileToObjectsList("src/accountsJson.txt",
                new TypeToken<List<Account>>(){}.getType());
        System.out.println(calcSumOfCanceledTransOnNonEmptyAccounts(accounts));
    }

    //task 1
    private static String capitalizeFirstLetter(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    //task 6,7
    static <T> List<T> fromJsonFileToObjectsList(String path, Type listType) throws IOException {
        StringBuilder objListJson = new StringBuilder();
        Files
                .lines(Path.of(path))
                .forEach(objListJson::append);
        return new Gson().fromJson(objListJson.toString(), listType);
    }
}
