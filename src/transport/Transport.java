package transport;

public abstract class Transport<T extends Driver> implements Competing {
    private final String brand;
    private final String model;
    private double engineVolume;
    private T driver;
    private BodyType bodyType;
    private Size size;
    private LoadCapacity loadCapacity;



    public Transport(String brand, String model, double engineVolume, T driver ) {
        this.brand = brand;
        if (brand == null || brand.isEmpty()) {
            brand = "default";
        }
        this.model = model;
        if (model == null || model.isEmpty()) {
            model = "default";
        }
        setEngineVolume(engineVolume);
        setDriver(driver);


    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            engineVolume = 1.6;
        }
        this.engineVolume = engineVolume;
    }

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    public abstract void startMove();

    public abstract void finishMove();
    public abstract Type getType();
    public abstract void printType();

    @Override
    public String toString() {
        return "Марка: " + brand + ", "
                + "модель:" + model + ", "
                + "объем двигателя " + engineVolume;
    }
}
