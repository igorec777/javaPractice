package lesson1.task2.models;

import lesson1.task2.util.Car;


public class SportCar extends Car {
    public enum Purpose {
        RING_RACE,
        DIRECT_DISTANCE,
        RALLY,
        AUTOCROSS,
        DRIFT,
        KARTING
    }

    private Purpose purpose;

    public SportCar(String mark, String model, int year, Color color, Purpose purpose) {
        super(mark, model, year, color);

        this.purpose = purpose;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }

        SportCar sportCar = (SportCar) obj;

        return purpose != null && purpose.equals(sportCar.purpose);
    }

    @Override
    public String toString() {
        return
                super.toString() + "SportCar{" +
                        "purpose=" + purpose +
                        '}';
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();

        result *= 31 + (purpose == null ? 1 : purpose.hashCode());

        return result;
    }
}
