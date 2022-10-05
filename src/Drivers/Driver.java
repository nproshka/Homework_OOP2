package Drivers;

import Cars.Cars;
import Cars.Competing;

public class Driver <E extends Cars & Competing> {

    private String name;
    private String typeDriveLicense;
    private int experience;

    public Driver(String name, String driveLicense, int experience) {
        this.name = name;
        this.typeDriveLicense = driveLicense;
        this.experience = experience;
    }

    public void startMoving(E car) {
        System.out.println("Начинаю движение на машине ");
    }
    public void getInfo(E car) {
        System.out.println("Водитель " + getName() + " с категорией " + getTypeDriveLicenseDriveLicense() + ", управляет автомобилем " + car.getBrand() + " " + car.getModel() + " и будет учавствовать в заезде");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeDriveLicenseDriveLicense() {
        return typeDriveLicense;
    }

    public void setDriveLicense(String driveLicense) {
        this.typeDriveLicense = driveLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }


}
