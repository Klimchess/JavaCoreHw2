package transport;

public class Mechanic {
    private String name;
    private String surname;
    private String company;

    public Mechanic(String name, String surname, String company) {
        this.name = name;
        this.surname = surname;
        this.company = company;
    }

    public void conductTechService(){
        System.out.println("Механик провел техобслуживание");
    };
    public void fixTheCar(){
        System.out.println("Механик починил машину");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
    @Override
    public String toString() {
        return "Механик " + name +
                " " + surname+ "," +
                " место работы компания - " + company;}
}
