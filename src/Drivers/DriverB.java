package Drivers;

import Cars.Cars;

public class DriverB extends Driver<Cars>{
    public DriverB(String name, String driveLicense, int experience, Cars vehicle) {
        super(name, driveLicense, experience, vehicle);
    }
}
