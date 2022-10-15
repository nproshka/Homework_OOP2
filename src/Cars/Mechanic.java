package Cars;

import java.util.Objects;

public class Mechanic<E extends Cars> {

    private final String name;
    private String company;

    public Mechanic(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public void performMaintenance(E car) {
        System.out.println("Провожу тех обслуживание " + car.getBrand() + " " + car.getModel());
    }
    public void repairCar (E car) {
        System.out.println("Провожу ремонт " + car.getBrand() + " " + car.getModel());
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic<?> mechanic = (Mechanic<?>) o;
        return name.equals(mechanic.name) && company.equals(mechanic.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, company);
    }

    @Override
    public String toString() {
        return getName() + " из компании " + getCompany();
    }
}
