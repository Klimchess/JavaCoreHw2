import transport.*;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            DriverB driverB = new DriverB("Driver cat B №" + i,
                    true,
                    5 + i);
            Car car = new Car("Bus brand N" + i,
                    "Car model N" + i,
                    2.1,
                    driverB);
            DriverC driverC = new DriverC("Driver cat. C №" + i,
                    true,
                    7 + i);
            Truck truck = new Truck("Truck brand N" + i,
                    "Bus model N" + i,
                    4.8,
                    driverC, null, null);
            DriverD driverD = new DriverD("Driver cat. D №" + i,
                    true,
                    10 + i);
            Bus bus = new Bus("Bus brand N" + i,
                    "Bus model N" + i,
                    4.1,
                    driverD);
            printInfo(car);
            printInfo(bus);
            printInfo(truck);
        }
    }

    private static void printInfo(Transport<?> transport) {
        System.out.println("Водитель " + transport.getDriver().getName() +
                " управляет автомобилем " + transport.getBrand() + " и будет участвовать в заезде");
    }
}