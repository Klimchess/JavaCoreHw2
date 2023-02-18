package transport;

public class DriverD extends Driver {
    public DriverD(String name,
                   boolean hasDriverLicence,
                   int experienceInYears) {
        super(name, hasDriverLicence, experienceInYears);
    }

    @Override
    public void startMove() {
        System.out.println("Водитель категории В "+ getName() + "начал движение");

    }

    @Override
    public void finishMove() {
        System.out.println("Водитель категории В "+ getName() + "закончил движение");
    }

    @Override
    public void refill() {
        System.out.println("Водитель категории В "+ getName() + "заправляет авто");

    }
}
