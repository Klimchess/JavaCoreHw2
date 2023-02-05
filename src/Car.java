public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
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

    @Override
    public String toString() {
        return "Марка: "+brand+ ", "+
                "модель:"+model+ ", "+
                "объём двигателя: "+engineVolume+ ", "+
                "цвет: "+color+", "+
                "год производства: "+year+ ", "+
                "страна сборки: "+country;
    }
}
