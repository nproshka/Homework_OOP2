package Cars;

import Drivers.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;


public abstract class Cars {

    private final String brand;
    private final String model;
    private double engineCapacity;
    private Driver<?> driver;
    private List<Sponsor> sponsors = new ArrayList<>();
    private List<Mechanic<?>> mechanics = new ArrayList<>();

    public Cars(String brand, String model, double engineCapacity, Driver<?> driver) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "Некорректно указано Марка";
        } else {
            this.brand = brand;
        }

        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "Некорректно указано Марка";
        } else {
            this.model = model;
        }
        setEngineCapacity(engineCapacity);
        this.driver = driver;
    }

    public void addSponsor(Sponsor... sponsors) {
        this.sponsors.addAll(Arrays.asList(sponsors));
    }
    public void addMechanic(Mechanic<?>... mechanics) {
        this.mechanics.addAll(Arrays.asList(mechanics));
    }


    public abstract void startMoving();
    public abstract void endMoving();

    public abstract void defineType();
    public abstract boolean diagnosticCar();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        if (engineCapacity <= 0) {
            this.engineCapacity = 1;
        } else {
            this.engineCapacity = engineCapacity;
        }
    }

    public Driver<?> getDriver() {
        return driver;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public void setDriver(Driver<?> driver) {
        this.driver = driver;
    }

    public void setSponsors(List<Sponsor> sponsors) {
        this.sponsors = sponsors;
    }

    public void setMechanics(List<Mechanic<?>> mechanics) {
        this.mechanics = mechanics;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cars cars = (Cars) o;
        return Double.compare(cars.engineCapacity, engineCapacity) == 0 && brand.equals(cars.brand) && model.equals(cars.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineCapacity);
    }

    @Override
    public String toString() {
        return brand + " " + model + " объём двигателя - " + engineCapacity;
    }
}
