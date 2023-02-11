package transport;

public class Transport {
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String color;
    private int maxSpeed;

    public Transport(String brand,
                     String model,
                     int year,
                     String country,
                     String color,
                     int maxSpeed) {
        this.brand = brand;
        if (brand == null || brand.isEmpty()){
            brand = "default";
        }
        this.model = model;
        if (model == null || model.isEmpty()){
            model = "default";}
        this.year = year;
        if (year <=0){
            year = 2000;}
        this.country = country;
        if (country == null || country.isEmpty()){
            country = "default";}
        setColor(color);
        setMaxSpeed(maxSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
        if (color == null || color.isEmpty()){
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <=0) {
            maxSpeed = 120;
        }
        this.maxSpeed = maxSpeed;
    }
    @Override
    public String toString() {
        return "Марка: "+brand+ ", "+
                "модель:"+model+ ", "+
                "цвет: " + color +", "+
                "год производства: " + year + ", " +
                "страна сборки: " + country + ", " +
                "максимальная скорость: " + maxSpeed;
    }
}
