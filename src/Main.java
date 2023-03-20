import transport.*;
import transport.Transports.Bus;
import transport.Transports.Car;
import transport.Transports.Transport;
import transport.Transports.Truck;
import transport.driver.Driver;
import transport.driver.DriverB;
import transport.driver.DriverC;
import transport.driver.DriverD;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Transport> transports = new ArrayList<>();
        Set<Driver> driverList = new HashSet<>();
        Map<Transport, List<Mechanic>> map = new HashMap<>();
        for (int i = 1; i <= 4; i++) {
            DriverB driverB = new DriverB("Driver cat B №" + i,
                    true,
                    5 + i);
            Mechanic mechanicCar = new Mechanic("Иван", "Климов", "Лада");
            Car car = new Car("Car brand N" + i,
                    "Car model N" + i,
                    2.1,
                    driverB, List.of(mechanicCar));
            DriverC driverC = new DriverC("Driver cat. C №" + i,
                    true,
                    7 + i);
            Mechanic mechanicTruck = new Mechanic("Дмитрий", "Климов", "skyPro");
            Truck truck = new Truck("Truck brand N" + i,
                    "Bus model N" + i,
                    4.8,
                    driverC, List.of(mechanicTruck));
            DriverD driverD = new DriverD("Driver cat. D №" + i,
                    true,
                    10 + i);
            Mechanic mechanicBus = new Mechanic("Анатолий", "Климов", "ООО Автобусы");
            Bus bus = new Bus("Bus brand N" + i,
                    "Bus model N" + i,
                    4.1,
                    driverD, List.of(mechanicBus));
            printInfo(car);
            printInfo(bus);
            printInfo(truck);
            transports.add(car);
            transports.add(truck);
            transports.add(bus);


            driverList.add(driverB);
            driverList.add(driverC);
            driverList.add(driverD);
            map.put(car, car.getMechanicList());
            map.put(truck, truck.getMechanicList());
            map.put(bus, bus.getMechanicList());
        }
        Iterator<Driver> iterator = driverList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().getName());
        }
        for (Map.Entry<Transport,List<Mechanic>> entry : map.entrySet()) {
            System.out.println(entry.getKey().getBrand() + " " + entry.getKey().getModel()  + ": " + entry.getValue().stream()
                    .map(Mechanic::toString)
                    .collect(Collectors.joining(";")));
        }

    }
    private static void printInfo(Transport transport){
      System.out.println(transport);
    }




}