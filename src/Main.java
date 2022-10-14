import Cars.*;
import Drivers.DriverB;
import Drivers.DriverC;
import Drivers.DriverD;
import Cars.EasyCars.Body;
import Cars.Buses.PlaceCapacity;
import Cars.Trucks.LoadCapacity;

public class Main {
    public static void main(String[] args) throws Exception {

        EasyCars[] easyCars = new EasyCars[4];
        easyCars[0] = new EasyCars("Volkswagen", "Taos", 1.4, null);
        easyCars[1] = new EasyCars("Volkswagen", "Tiguan", 1.4, Body.HATCHBACK);
        easyCars[2] = new EasyCars("Chevrolet", "Camaro", 6.2, Body.SEDAN);
        easyCars[3] = new EasyCars("BMW", "X5", 4.4, Body.UNIVERSAL);

        Trucks[] trucks = new Trucks[4];
        trucks[0] = new Trucks("Hyandai", "Gold", 7.6, LoadCapacity.N2);
        trucks[1] = new Trucks("Scania", "4-series", 12.7, LoadCapacity.N3);
        trucks[2] = new Trucks("МАЗ", "4371", 4.7, LoadCapacity.N1);
        trucks[3] = new Trucks("IVECO", "EuroCargo", 5.9, LoadCapacity.N2);

        Buses[] buses = new Buses[4];
        buses[0] = new Buses("Kia", "Combi", 3.8, PlaceCapacity.AVERAGE);
        buses[1] = new Buses("Mercedes-Benz", "Sprinter", 3.0, PlaceCapacity.SMALL);
        buses[2] = new Buses("Kia", "Granbird", 17.2, PlaceCapacity.VERY_LARGE);
        buses[3] = new Buses("ЛиАЗ", "5256", 8.3, PlaceCapacity.LARGE);


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

        DriverB vladimir = new DriverB("Vladimir", "B", 3, easyCars[0]);
        DriverD andrey = new DriverD("Andrey", "D", 7, buses[1]);
        DriverC alexander = new DriverC("Alexander", "C", 5, trucks[3]);
        System.out.println(alexander);
        System.out.println(andrey);
        System.out.println(vladimir);

        easyCars[0].defineType();
        buses[1].defineType();
        trucks[2].defineType();

        System.out.println();

        Registration.register("SmaSh2R", "12345!G", "12345G");

        System.out.println();

        Registration.register("SmaSh2R", "12345G", "123456");

        System.out.println();

        Registration.register("SmaSh!R", "12345!G", "12345G");

    }




}