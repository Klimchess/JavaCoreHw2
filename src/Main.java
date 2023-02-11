import transport.Bus;
import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car(
                "Lada",
                "Granta",
                1.7,
                "желтый",
                2015,
                "Россия",
                130,
                "4-х ступенчатая",
                "седан",
                "а111аа",
                5,
                true,
                null);
       System.out.println(lada);


        Car audi = new Car(
                "Audi",
                "A8 50 L TDI quattro",
                3.0,
                "чёрный",
                2020,
                "Германия",
                210,
                "4-х ступенчатая",
                "седан",
                "а222аа",
                5,
                true,
                new Car.Key(true,true));
        System.out.println(audi);

        Car bmv = new Car(
                "BMV",
                "Z8",
                3.0,
                "чёрный",
                2021,
                "Германия",
                190,
                "4-х ступенчатая",
                "седан",
                "а333аа",
                5,
                true,new Car.Key(true,false));
        System.out.println(bmv);
        Car kia = new Car(
                "KIA",
                "Sportage 4-го поколения",
                2.4,
                "красный",
                2018,
                "Южная Корея",
                180,
                "4-х ступенчатая",
                "седан",
                "а444аа",
                4, true,
                new Car.Key(false,true)
                );
        System.out.println(kia);
        Car hyundai = new Car(
                "Hyundai",
                "Avante",
                1.6,
                "оранжевый",
                2016,
                "Южная Корея",
                200,
                "4-х ступенчатая",
                "седан",
                "а555аа",
                4,
                true,null);
        System.out.println(hyundai);
        for (int i = 0; i < 3; i++) {
            Bus bus = new Bus("Bus brand N" + i,
                    "Bus model N" + i,
                    2011 + i,
                    "Russia",
                    "green",
                    110);
            System.out.println(bus);

        }

    }
}