package lesson4.task;

import org.junit.jupiter.api.Test;

class LandRoverTest {

    @Test
    void landRoverTest() {
        LandRover obj = new LandRover(5);

        MyThreads threads = new MyThreads(obj);
        threads.runThreads();
    }

}