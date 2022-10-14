package Drivers;

import Cars.Cars;

public abstract class Driver <E extends Cars> {

    private String name;
    private String typeDriveLicense;
    private int experience;
    private E vehicle;

    public Driver(String name, String typeDriveLicense, int experience, E vehicle) {
        this.name = name;
        setTypeDriveLicense(typeDriveLicense);
        this.experience = experience;
        this.vehicle = vehicle;
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

    public void setTypeDriveLicense(String typeDriveLicense) {
        if (typeDriveLicense == null || typeDriveLicense.isEmpty()) {
            throw new IllegalArgumentException("Необходимо указать тип прав!");
        } else {
            this.typeDriveLicense = typeDriveLicense;
        }
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public E getVehicle() {
        return vehicle;
    }
    public void setVehicle(E vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "Водитель " + getName() + " с категорией " + getTypeDriveLicenseDriveLicense() + ", управляет автомобилем "+ getVehicle() + " и будет учавствовать в заезде";
    }
}
