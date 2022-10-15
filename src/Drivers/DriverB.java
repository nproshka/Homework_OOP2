package Drivers;

import Cars.Cars;

public class DriverB extends Driver<Cars>{
    public DriverB(String name, String typeDriveLicense, int experience, Cars vehicle) {
        super(name, typeDriveLicense, experience, vehicle);
    }

    public DriverB(String name, String typeDriveLicense, int experience) {
        super(name, typeDriveLicense, experience);
    }
}
