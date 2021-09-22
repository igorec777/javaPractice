package lesson4.task;

public class MyThreads {

    private int counter = 1;
    final LandRover obj;

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
            task("number");
        }
    }

    void task(String word) {
        synchronized (obj) {
            while (counter <= obj.getN()) {
                if (isSuitable(word)) {
                    switch (word) {
                        case "land": {
                            obj.land(() -> System.out.println("land"));
                            break;
                        }
                        case "rover": {
                            obj.land(() -> System.out.println("rover"));
                            break;
                        }
                        case "landRover": {
                            obj.land(() -> System.out.println("landRover"));
                            break;
                        }
                        default: {
                            obj.number(System.out::println, counter);
                        }
                    }
                    counter++;
                    obj.notifyAll();
                } else {
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    boolean isSuitable(String word) {
        switch (word) {
            case "land": {
                return counter % 3 == 0 && counter % 5 != 0;
            }
            case "rover": {
                return counter % 3 != 0 && counter % 5 == 0;
            }
            case "landRover": {
                return counter % 3 == 0 && counter % 5 == 0;
            }
            case "number": {
                return counter % 3 != 0 && counter % 5 != 0;
            }
        }
        return false;
    }

    public void runThreads() {
        new ThreadA().start();
        new ThreadB().start();
        new ThreadC().start();
        new ThreadD().start();
    }
}
