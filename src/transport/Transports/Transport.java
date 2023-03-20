package transport.Transports;

import transport.*;
import transport.driver.Driver;

import java.awt.*;
import java.util.List;
import java.util.Objects;

public abstract class Transport implements Competing {
    private final String brand;
    private final String model;
    private double engineVolume;
    private  Driver driver;
    private BodyType bodyType;
    private Size size;
    private LoadCapacity loadCapacity;

    private List<Mechanic>mechanicList;

    public Transport(String brand, String model, double engineVolume, Driver driver, List<Mechanic>mechanicList) {
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
        this.mechanicList = mechanicList;
    }

    public List<Mechanic> getMechanicList() {
        return mechanicList;
    }

    public void setMechanicList(List<Mechanic> mechanicList) {
        this.mechanicList = mechanicList;
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

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public abstract void startMove();

    public abstract void finishMove();
    public abstract Type getType();
    public abstract void printType();
    public abstract void passDiagnostics();

    @Override
    public String toString() {
        return "Марка: " + brand + ", "
                + "модель:" + model + ", "
                + "объем двигателя " + engineVolume +
                ", mechanicList=" + mechanicList;
    }

    public boolean checkAbilityToGoInspection() {
        try {
        passDiagnostics();
    } catch (TransportTypeException e) {
        return false;
    }
        return true;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model) && Objects.equals(driver, transport.driver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, driver);
    }
}
