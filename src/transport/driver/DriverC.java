package transport.driver;

import transport.driver.Driver;

public class DriverC extends Driver {
    public DriverC (String name,
                   boolean hasDriverLicence,
                   int experienceInYears) {
        super(name, hasDriverLicence, experienceInYears);
    }

    @Override
    public void startMove() {
        System.out.println("Водитель категории C "+ getName() + "начал движение");

    }

    @Override
    public void finishMove() {
        System.out.println("Водитель категории C "+ getName() + "закончил движение");
    }

    @Override
    public void refill() {
        System.out.println("Водитель категории C "+ getName() + "заправляет авто");

    }
}
