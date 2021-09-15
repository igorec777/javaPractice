package lesson1.task2.app;


import lesson1.task2.models.Bus;
import lesson1.task2.models.PassengerCar;
import lesson1.task2.models.SportCar;
import lesson1.task2.models.Truck;
import lesson1.task2.util.Car;
import lesson1.task2.util.Garage;

public class Program {
    public static void main(String... args) {
        test();
    }

    private static void test() {
        Car car1 = new SportCar("Caparo", "T1", 2007, Car.Color.BLACK, SportCar.Purpose.DIRECT_DISTANCE);
        Car car2 = new Bus("МАЗ", "232", 2018, Car.Color.GREEN, 9.1f, Bus.Purpose.INTERCITY);

        Car car3 = new PassengerCar("Mazda", "CX-9", 2015, Car.Color.RED, 2.5f,
                PassengerCar.BodyType.ESTATE);

        Car car4 = new Truck("КамАЗ", "43255", 2007, Car.Color.WHITE, 7000f);

        Garage garage = new Garage();

        System.out.println("\n*****PARKING TEST*****");

        garage.getCarsCount(SportCar.class);

        for (int i = 0; i < 1; i++) {
            garage.parking(car1);
            garage.parking(car2);
        }
        for (int i = 0; i < 2; i++) {
            garage.parking(car3);
            garage.parking(car4);
        }

        garage.getCarsCount(Truck.class);

        System.out.println("*****EXIT TEST*****\n");

        for (int i = 0; i < 2; i++) {
            garage.exit(car1);
            garage.exit(car2);
        }

        garage.getCarsCount(Bus.class);
        garage.getCarsCount(PassengerCar.class);

        for (int i = 0; i < 3; i++) {
            garage.exit(car3);
            garage.exit(car4);
        }

        garage.getCarsCount(SportCar.class);
    }
}
