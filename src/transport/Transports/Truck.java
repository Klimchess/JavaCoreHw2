package transport.Transports;

import transport.*;
import transport.Transports.Transport;
import transport.driver.DriverC;

import java.util.List;

public class Truck<T extends DriverC> extends Transport {

    public Truck(String brand, String model, double engineVolume, T driver, List<Mechanic> mechanicList) {
        super(brand, model, engineVolume, driver, mechanicList);
    }

    public void startMove() {
        System.out.println("Грузовик марки " + getBrand() + " начал движение");
    }

    public void finishMove() {
        System.out.println("Грузовик марки " + getBrand() + " закончил движение");
    }

    @Override
    public LoadCapacity getLoadCapacity() {
        return super.getLoadCapacity();
    }

    @Override
    public Type getType() {
        return Type.TRUCK;
    }

    public void pitStop() {
        System.out.println("Пит-стоп у грузовика");
    }

    @Override
    public void theBestTime() {
        int minBound = 100;
        int maxBound = 150;
        int theBestTimeMins = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Лучшее время круга для грузовика в минутах " + theBestTimeMins);
    }

    @Override
    public void maxSpeed() {
        int minBound = 80;
        int maxBound = 120;
        int maxSpeed = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Максимальная скорость грузовика " + maxSpeed);
    }

    @Override
    public void printType() {
        if(getLoadCapacity() == null){
            System.out.println("Недостаточно данных");
        } else {
            System.out.println(getLoadCapacity());
        }
    }

    @Override
    public void passDiagnostics()   {
        System.out.println("Грузовик прошел диагностику");

    }
}
