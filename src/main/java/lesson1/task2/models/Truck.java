package lesson1.task2.models;

import lesson1.task2.util.Car;


public class Truck extends Car {
    private final float payload;

    public Truck(String mark, String model, int year, Color color, float payload) {
        super(mark, model, year, color);

        this.payload = payload;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }

        Truck truck = (Truck) obj;

        return payload == truck.payload;
    }

    @Override
    public String toString() {
        return
                super.toString() + "Truck{" +
                        "payload=" + payload +
                        '}';
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();

        result *= 31 + payload;

        return result;
    }
}
