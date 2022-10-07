package Drivers;

import Cars.Cars;

public class DriverC extends Driver<Cars>{
    public DriverC(String name, String driveLicense, int experience, Cars vehicle) {
        super(name, driveLicense, experience, vehicle);
    }
}
