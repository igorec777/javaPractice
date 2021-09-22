package lesson4.task;

public class MyThreads {

    private int counter = 1;
    private final LandRover obj;

    public MyThreads(LandRover obj) {
        this.obj = obj;
    }

    class ThreadA extends Thread {
        @Override
        public void run() {
            task("land");
        }
    }

    class ThreadB extends Thread {
        @Override
        public void run() {
            task("rover");
        }
    }

    class ThreadC extends Thread {
        @Override
        public void run() {
            task("landRover");
        }
    }

    class ThreadD extends Thread {
        @Override
        public void run() {
            task(String.valueOf(counter));
        }
    }

    synchronized void task(String word) {
        while (counter <= obj.getN()) {
            if (isSuitable(word)) {
                counter++;
                notifyAll();
            }
            else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    boolean isSuitable(String word) {
        switch (word) {
            case "land": {
                if (counter % 3 == 0 && counter % 5 != 0) {
                    obj.land(() -> System.out.println(word));
                    return true;
                }
                else {
                    return false;
                }
            }
            case "rover": {
                if (counter % 5 == 0 && counter % 3 != 0) {
                    obj.rover(() -> System.out.println(word));
                    return true;
                }
                else {
                    return false;
                }
            }
            case "landRover": {
                if (counter % 15 == 0) {
                    obj.landrover(() -> System.out.println(word));
                    return true;
                }
                else {
                    return false;
                }
            }
            default: {
                if (counter % 3 != 0 && counter % 5 != 0) {
                    obj.number(System.out::println, counter);
                    return true;
                }
                else {
                    return false;
                }
            }
        }
    }

    public void runThreads() {
        new ThreadA().start();
        new ThreadB().start();
        new ThreadC().start();
        new ThreadD().start();
    }
}
