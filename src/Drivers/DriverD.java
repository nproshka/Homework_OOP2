package Drivers;


import Cars.Cars;

public class DriverD extends Driver<Cars>{
    public DriverD(String name, String driveLicense, int experience, Cars vehicle) {
        super(name, driveLicense, experience, vehicle);
    }
}
