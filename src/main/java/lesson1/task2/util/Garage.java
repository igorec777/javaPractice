package lesson1.task2.util;

import java.util.HashMap;
import java.util.Map;


public class Garage {
    private final Map<Car, Integer> cars = new HashMap<>();

    public void parking(Car car) {
        cars.merge(car, 1, Integer::sum);

        System.out.println(car.getFullName() + " has been parked");
    }

    public void getCarsCount(Class<? extends Car> carClass) {
        System.out.println(carClass.getSimpleName() + "'s{");

        for (Car c : cars.keySet()) {
            if (c.getClass().getSimpleName().equals(carClass.getSimpleName())) {
                System.out.println(c.getFullName() + " = " + cars.get(c));
            }
        }
        System.out.println("}");
    }

    public void exit(Car car) {
        if (cars.get(car) == null)
            System.out.println("No car named " + car.getFullName() + " in garage");
        else {
            cars.put(car, cars.get(car) - 1);

            if (cars.get(car) == 0) {
                cars.remove(car);
            }

            System.out.println(car.getFullName() + " has been exit");
        }
    }
}
