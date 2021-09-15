package lesson1.task2.models;

import lesson1.task2.util.Car;


public class PassengerCar extends Car {
    public enum BodyType {
        SEDAN,
        COUPE,
        ESTATE,
        LIMOUSINE,
        MINIVAN,
        CABRIOLET
    }

    private final BodyType bodyType;
    private final float engineCapacity;

    public PassengerCar(String mark, String model, int year, Color color, float engineCapacity, BodyType bodyType) {
        super(mark, model, year, color);

        this.engineCapacity = engineCapacity;
        this.bodyType = bodyType;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj))
            return false;

        PassengerCar passengerCar = (PassengerCar) obj;

        return engineCapacity == passengerCar.engineCapacity
                && (bodyType != null && bodyType.equals(passengerCar.bodyType));
    }

    @Override
    public String toString() {
        return
                super.toString() + "PassengerCar{" +
                        "bodyType=" + bodyType +
                        ", engineCapacity=" + engineCapacity +
                        '}';
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();

        result *= 31 + engineCapacity;
        result *= 31 + (bodyType == null ? 1 : bodyType.hashCode());

        return result;
    }
}


