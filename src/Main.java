import transport.Bus;
import transport.Car;
import transport.Truck;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            Car car = new Car("Bus brand N" + i,
                    "Car model N" + i,
                    2.1);
            Truck truck = new Truck("Truck brand N" + i,
                "Bus model N" + i,
                4.8);
            Bus bus = new Bus("Bus brand N" + i,
            "Bus model N" + i,
            4.1);
            System.out.println(car);
            System.out.println(truck);
            System.out.println(bus);
        }

    }
}