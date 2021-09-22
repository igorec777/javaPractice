package lesson4.task;

import java.util.function.IntConsumer;

public class LandRover {
    private int n;

    public LandRover(int n) {
        if (n < 1 || n > 50) {
            throw new IllegalArgumentException("n must be between 1 and 50");
        }
        this.n = n;
    }

    public void land(Runnable printLand) {
        printLand.run();
    }

    public void rover(Runnable printRover) {
        printRover.run();
    }

    public void landrover(Runnable printLandRover) {
        printLandRover.run();
    }

    public void number(IntConsumer printNumber, int value) {
        printNumber.accept(value);
    }

    public int getN() {
        return n;
    }
}
