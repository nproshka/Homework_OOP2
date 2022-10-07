import Cars.*;
import Drivers.Driver;
import Drivers.DriverB;
import Drivers.DriverC;
import Drivers.DriverD;

public class Main {
    public static void main(String[] args) {

        EasyCars[] easyCars = new EasyCars[4];
        easyCars[0] = new EasyCars("Volkswagen", "Taos", 1.4);
        easyCars[1] = new EasyCars("Volkswagen", "Tiguan", 1.4);
        easyCars[2] = new EasyCars("Chevrolet", "Camaro", 6.2);
        easyCars[3] = new EasyCars("BMW", "X5", 4.4);

        Trucks[] trucks = new Trucks[4];
        trucks[0] = new Trucks("Hyandai", "Gold", 7.6);
        trucks[1] = new Trucks("Scania", "4-series", 12.7);
        trucks[2] = new Trucks("МАЗ", "4371", 4.7);
        trucks[3] = new Trucks("IVECO", "EuroCargo", 5.9);

        Buses[] buses = new Buses[4];
        buses[0] = new Buses("Kia", "Combi", 3.8);
        buses[1] = new Buses("Mercedes-Benz", "Sprinter", 3.0);
        buses[2] = new Buses("Kia", "Granbird", 17.2);
        buses[3] = new Buses("ЛиАЗ", "5256", 8.3);


        for (EasyCars easyCar : easyCars) {
            System.out.println(easyCar);
        }

        System.out.println();

        for (Trucks truck : trucks) {
            System.out.println(truck);
        }

        System.out.println();

        for (Buses bus : buses) {
            System.out.println(bus);
        }

        for (EasyCars easyCar : easyCars) {
            easyCar.stayOnPitStop();
            easyCar.getBestLapTime();
            easyCar.getMaxSpeed();
            System.out.println();
        }

        System.out.println();

        for (Buses bus : buses) {
            bus.stayOnPitStop();
            bus.getBestLapTime();
            bus.getMaxSpeed();
            System.out.println();
        }

        System.out.println();

        for (Trucks truck : trucks) {
            truck.stayOnPitStop();
            truck.getBestLapTime();
            truck.getMaxSpeed();
            System.out.println();
        }

        DriverB vladimir = new DriverB ("Vladimir", "B", 3, easyCars[0]);
        DriverD andrey = new DriverD ("Andrey", "D", 7, buses[1]);
        DriverC alexander = new DriverC ("Alexander", "C", 5, trucks[3]);
        System.out.println(alexander);
        System.out.println(andrey);
        System.out.println(vladimir);


    }
}