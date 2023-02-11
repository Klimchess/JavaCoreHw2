package transport;

public class Car extends Transport{

  private double engineVolume;

  private String transmission; //коробка передач
  private final String bodyType; //тип кузова
  private String registrationNumber;
  private final int capacity; //вместимость
    private boolean rubber; //резина летняя или зимняя
    private Key key;
    public static class Key {
        private final boolean remoteRun;
        private boolean withoutAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteRun = remoteEngineStart;
            this.withoutAccess = keylessAccess;
        }
        public boolean isRemoteRun(){
            return remoteRun;
        }
        public boolean isWithoutAccess(){
            return withoutAccess;
        }
        @Override
        public String toString(){
            return (remoteRun?"удаленный запуск двигателя":"без удаленного запуска двигателя") +", "+
            (remoteRun?"бесключевой доступ":"бесключевой доступ отсутствует");

        }
    }

    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int year,
               String country,
               int maxSpeed,
               String transmission,
               String bodyType,
               String registrationNumber,
               int capacity,
               boolean rubber,
               Key key) {
        super(brand, model, year, country, color, maxSpeed);

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


        this.engineVolume = engineVolume;
        setEngineVolume(engineVolume);



            setKey(key);

    }



    public double getEngineVolume() {
        return engineVolume;
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
        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }
    }

    public void setTransmission(String transmission) {
        if (transmission==null || transmission.isEmpty()) {
            transmission = "МКПП";
        }
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        if (key == null) {
            key =new Key(false, false);
        }
        this.key = key;
    }

    public void setRubber(boolean rubber) {
        this.rubber = rubber;
    }
    public void changeRubber(int month) {
        if((month >=11 && month <= 12) || (month >=1 && month <=3)) {
            rubber = false;
        }
        if (month >= 4 && month <= 10) {
            rubber = true;
        }
    }

    @Override
    public String toString() {
        return super.toString()+ ", " +
                "объём двигателя: " + engineVolume + ", "+
                "коробка передач: " + transmission + ", " +
                "тип кузова: " + bodyType + ", " +
                "регистрационный номер: " + registrationNumber + ", " +
                "количество мест: " + capacity + ", " +
                (rubber?"летняя":"зимняя") + " резина" + ", " +
                key;
    }

}
