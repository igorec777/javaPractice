package lesson1.task2.models;


import lesson1.task2.util.Car;


public class Bus extends Car {
    public enum Purpose {
        SCHOOL,
        CITY,
        TRAVEL,
        INTERCITY
    }

    private final Purpose purpose;
    private final float length;

    public Bus(String mark, String model, int year, Color color, float length, Purpose purpose) {
        super(mark, model, year, color);

        this.length = length;
        this.purpose = purpose;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }

        Bus bus = (Bus) obj;

        return length == bus.length
                && (purpose != null && purpose.equals(bus.purpose));
    }

    @Override
    public String toString() {
        return
                super.toString() + "Bus{" +
                        "purpose=" + purpose +
                        ", length=" + length +
                        '}';
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();

        result *= 31 + length;
        result *= 31 + (purpose == null ? 1 : purpose.hashCode());

        return result;
    }
}
