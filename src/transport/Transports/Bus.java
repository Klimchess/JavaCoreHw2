package transport.Transports;

import transport.Mechanic;
import transport.Size;
import transport.TransportTypeException;
import transport.Type;
import transport.driver.DriverD;

import java.util.List;

public class Bus<T extends DriverD> extends Transport{


    public Bus(String brand, String model, double engineVolume, T driver, List<Mechanic> mechanicList) {
        super(brand, model, engineVolume, driver, mechanicList);
    }

    public void startMove() {
        System.out.println("Автобус марки " + getBrand() + " начал движение");
    }

    public void finishMove() {
        System.out.println("Автобус марки " + getBrand() + " закончил движение");
    }

    @Override
    public Size getSize() {
        return super.getSize();
    }

    @Override
    public Type getType() {
        return Type.BUS;
    }

    @Override
    public void printType() {
        if(getSize() == null){
            System.out.println("Недостаточно данных");
        } else {
            System.out.println(getSize());
        }
    }

    @Override
    public void passDiagnostics() throws TransportTypeException {
        throw new TransportTypeException("Автобусы диагностику проходить не должны");
    }



    @Override
    public void pitStop() {
        System.out.println("Пит-стоп у автобуса");
    }

    @Override
    public void theBestTime() {
        int minBound = 100;
        int maxBound = 150;
        int theBestTimeMins = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Лучшее время круга для автобсусов в минутах " + theBestTimeMins);
    }

    @Override
    public void maxSpeed() {
        int minBound = 80;
        int maxBound = 120;
        int maxSpeed = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Максимальная скорость автобсуса " + maxSpeed);
    }
}

