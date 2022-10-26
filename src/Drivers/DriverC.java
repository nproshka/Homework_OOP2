package Drivers;

import Cars.Cars;

public class DriverC extends Driver<Cars>{
    public DriverC(String name, String driveLicense, int experience, Cars vehicle) {
        super(name, driveLicense, experience, vehicle);
    }

    public DriverC(String name, String typeDriveLicense, int experience) {
        super(name, typeDriveLicense, experience);
    }
}
