package lesson3.part2.task3;

import org.junit.jupiter.api.Test;

import static lesson3.part2.task3.Task3.commonRequestHandler;
import static org.assertj.core.api.Assertions.assertThat;

class Task3Test {

    @Test
    void handleTest() {
        final String data = "sample data";
        final Task3.Request request = new Task3.Request(data);

		//still don't know, how to do it not via a string
        assertThat(commonRequestHandler.handle(request).getData())
                .contains("sample data");
        assertThat(commonRequestHandler.handle(request).getData())
                .contains("request");
        assertThat(commonRequestHandler.handle(request).getData())
                .contains("transaction");
        assertThat(commonRequestHandler.handle(request).getData())
                .contains("digest");
    }
}