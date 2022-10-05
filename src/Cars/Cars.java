package Cars;

import java.util.Objects;

public abstract class Cars {

    private final String brand;
    private final String model;
    private double engineCapacity;

    public Cars(String brand, String model, double engineCapacity) {
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
    }

    public abstract void startMoving();
    public abstract void endMoving();

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
