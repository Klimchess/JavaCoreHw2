package transport.driver;

import java.util.Objects;

public abstract class Driver {
    private String name;
    private boolean hasDriverLicence;
    private int experienceInYears;

    public Driver(String name,
                  boolean hasDriverLicence,
                  int experienceInYears) {
        this.name = name;
        this.hasDriverLicence = hasDriverLicence;
        this.experienceInYears = experienceInYears;
    }
    public abstract void startMove();
    public abstract void  finishMove();
    public abstract void refill();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasDriverLicence() {
        return hasDriverLicence;
    }

    public void setHasDriverLicence(boolean hasDriverLicence) {
        this.hasDriverLicence = hasDriverLicence;
    }

    public int getExperienceInYears() {
        return experienceInYears;
    }

    public void setExperienceInYears(int experienceInYears) {
        this.experienceInYears = experienceInYears;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return Objects.equals(name, driver.name) && Objects.equals(hasDriverLicence, driver.hasDriverLicence) && Objects.equals(experienceInYears, driver.experienceInYears);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, hasDriverLicence, experienceInYears);
    }
}
