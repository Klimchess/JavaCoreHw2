package transport.Transports;

import transport.BodyType;
import transport.Mechanic;
import transport.Type;
import transport.driver.DriverB;

import java.util.List;

public class Car<T extends DriverB> extends Transport {
    public Car(String brand, String model, double engineVolume, T driver, List<Mechanic> mechanicList) {
        super(brand, model, engineVolume, driver, mechanicList);
    }

    @Override
    public BodyType getBodyType() {
        return super.getBodyType();
    }

    @Override
    public void startMove() {
        System.out.println("Автомобиль марки " + getBrand() + " начал движение");
    }

    public void finishMove() {
        System.out.println("Автомобиль марки " + getBrand() + " закончил движение");
    }

    @Override
    public Type getType() {
        return Type.CAR;
    }

    @Override
    public void printType() {
        if(getBodyType() == null){
            System.out.println("Недостаточно данных");
        } else {
            System.out.println(getBodyType());
        }
    }

    @Override
    public void passDiagnostics()   {
        System.out.println("Машина прошла диагностику");
    }


    public void pitStop() {
        System.out.println("Пит-стоп у машины");
    }

    @Override
    public void theBestTime() {
        int minBound = 100;
        int maxBound = 150;
        int theBestTimeMins = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Лучшее время круга для машины в минутах " + theBestTimeMins);
    }

    @Override
    public void maxSpeed() {
        int minBound = 80;
        int maxBound = 120;
        int maxSpeed = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Максимальная скорость машины " + maxSpeed);
    }
}


