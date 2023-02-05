package transport;

public class Car {
   final String brand;
   final String model;
    double engineVolume;
    String color;
   final int year;
   final String country;
    String transmission; //коробка передач
   final String bodyType; //тип кузова
    String registrationNumber;
   final int capacity; //вместимость
    boolean rubber; //резина летняя или зимняя

    public Car(String brand, String model, double engineVolume, String color, int year, String country, String transmission, String bodyType, String registrationNumber, int capacity, boolean rubber) {

        this.transmission = transmission;
        if ( transmission == null || brand.isEmpty()){
            transmission = "default";
        }
        this.bodyType = bodyType;
        if (bodyType == null || brand.isEmpty()){
            bodyType = "default";
        }
        this.registrationNumber = registrationNumber;
        if (registrationNumber == null || brand.isEmpty()){
            registrationNumber = "default";
        }
        this.capacity = capacity;
        if (capacity <= 0) {
            capacity = 1;
        }
        this.rubber = rubber;

        this.brand = brand;
        if (brand == null || brand.isEmpty()){
            brand = "default";
        }
        this.model = model;
        if (model == null || model.isEmpty()){
            model = "default";}
        this.engineVolume = engineVolume;
        if (engineVolume <= 0){
        engineVolume = 1.5;}

        this.color = color;
        if (color == null || color.isEmpty()){
            brand = "белый";}
        this.year = year;
        if (year <=0){
        year = 2000;}
        this.country = country;
            if (country == null || country.isEmpty()){
                country = "default";}

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

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isRubber() {
        return rubber;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setRubber(boolean rubber) {
        this.rubber = rubber;
    }

    @Override
    public String toString() {
        return "Марка: "+brand+ ", "+
                "модель:"+model+ ", "+
                "объём двигателя: "+engineVolume+ ", "+
                "цвет: "+color+", "+
                "год производства: "+year+ ", "+
                "страна сборки: "+country;
    }
    public static class Key {
       private boolean remoteEngineStart;
       private boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }
    }
}
