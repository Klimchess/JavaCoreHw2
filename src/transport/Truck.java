package transport;

public class Truck extends Transport<DriverC> {
    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }
    public void startMove() {
        System.out.println("Грузовик марки " + getBrand() + " начал движение");
    }
    public void finishMove() {
        System.out.println("Грузовик марки " + getBrand() + " закончил движение");
    }
    public void pitStop() {
        System.out.println("Пит-стоп у грузовика");
    }
    @Override
    public void theBestTime() {
        int minBound = 100;
        int maxBound = 150;
        int theBestTimeMins = (int) (minBound+ (maxBound-minBound)*Math.random());
        System.out.println("Лучшее время круга для грузовика в минутах "+ theBestTimeMins);
    }
    @Override
    public void maxSpeed() {
        int minBound = 80;
        int maxBound = 120;
        int maxSpeed = (int) (minBound+ (maxBound-minBound)*Math.random());
        System.out.println("Максимальная скорость грузовика " + maxSpeed);
    }
}
