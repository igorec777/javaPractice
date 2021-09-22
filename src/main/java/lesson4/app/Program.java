package lesson4.app;

import lesson4.task.LandRover;
import lesson4.task.MyThreads;

public class Program {
    public static void main(String... args) throws InterruptedException {
          LandRover obj = new LandRover(15);
          MyThreads threads = new MyThreads(obj);
          threads.runThreads();
    }
}






