package transport;

public abstract class Transport<D extends Driver> implements Competing {
    private final String brand;
    private final String model;
    private double engineVolume;


    public Transport(String brand,
                     String model,
                   double engineVolume) {
        this.brand = brand;
        if (brand == null || brand.isEmpty()){
            brand = "default";
        }
        this.model = model;
        if (model == null || model.isEmpty()){
            model = "default";}
        setEngineVolume(engineVolume);


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
        if (engineVolume <=0){
            engineVolume = 1.6;
        }
        this.engineVolume = engineVolume;
    }
    public abstract void startMove();
    public abstract void finishMove();

    @Override
    public String  toString() {
        return "Марка: "+brand+ ", "+
                "модель:"+model+ ", "+
                "объем двигателя " + engineVolume;
    }
}
