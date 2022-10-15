import Cars.*;
import Drivers.DriverB;
import Drivers.DriverC;
import Drivers.DriverD;
import Cars.EasyCars.Body;
import Cars.Buses.PlaceCapacity;
import Cars.Trucks.LoadCapacity;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Mechanic<EasyCars> volodya = new Mechanic<EasyCars>("Филин Владимир", "'Легковые автомобили+'");
        Mechanic<Trucks> nikita = new Mechanic<Trucks>("Алексеева Никита", "'Энергия'");
        Mechanic<Buses> genady = new Mechanic<Buses>("Горин Геннадий", "'Вип Авто'");
        Mechanic<Cars> vadim = new Mechanic<Cars>("Шевелев Вадим", "'Всё правильно'");

        Sponsor redBull = new Sponsor("Red Bull", 300_000);
        Sponsor gasprom = new Sponsor("Газпром", 1_000_000);
        Sponsor motul = new Sponsor("Motul", 100_000);
        Sponsor lykoil = new Sponsor("Лукойл", 350_000);

        DriverB stepan = new DriverB("Степан", "B", 9);
        DriverC igor = new DriverC("Игорь", "С", 5);
        DriverD roman = new DriverD("Роман", "D", 12);


        EasyCars[] easyCars = new EasyCars[4];
//        easyCars[0] = new EasyCars("Volkswagen", "Taos", 1.4, null);
//        easyCars[1] = new EasyCars("Volkswagen", "Tiguan", 1.4, Body.HATCHBACK);
//        easyCars[2] = new EasyCars("Chevrolet", "Camaro", 6.2, Body.SEDAN);
        easyCars[3] = new EasyCars("BMW", "X5", 4.4, stepan, Body.HATCHBACK);

        easyCars[3].addSponsor(lykoil, gasprom, redBull);
        easyCars[3].addMechanic(volodya, vadim);

        Trucks[] trucks = new Trucks[4];
//        trucks[0] = new Trucks("Hyandai", "Gold", 7.6, LoadCapacity.N2);
        trucks[1] = new Trucks("Scania", "4-series", 12.7, igor, LoadCapacity.N3);
//        trucks[2] = new Trucks("МАЗ", "4371", 4.7, LoadCapacity.N1);
//        trucks[3] = new Trucks("IVECO", "EuroCargo", 5.9, LoadCapacity.N2);

        trucks[1].addSponsor(motul, lykoil);
        trucks[1].addMechanic(nikita, vadim);

        Buses[] buses = new Buses[4];
//        buses[0] = new Buses("Kia", "Combi", 3.8, PlaceCapacity.AVERAGE);
//        buses[1] = new Buses("Mercedes-Benz", "Sprinter", 3.0, PlaceCapacity.SMALL);
        buses[2] = new Buses("Kia", "Granbird", 17.2, roman, PlaceCapacity.VERY_LARGE);
//        buses[3] = new Buses("ЛиАЗ", "5256", 8.3, PlaceCapacity.LARGE);

        buses[2].addSponsor(redBull, motul, lykoil);
        buses[2].addMechanic(genady, vadim);

        List<Cars> cars = List.of(easyCars[3], trucks[1], buses[2]);


        for (Cars car : cars) {
            carInfo(car);
        }


//
//        for (int i = 0; i < easyCars.length; i++) {
//            try {
//                if (!easyCars[i].diagnosticCar()) {
//                    throw new RuntimeException("Автомобиль " + easyCars[i].getBrand() + " " + easyCars[i].getModel() + " диагностику не прошел");
//                }
//            }
//            catch (RuntimeException e) {
//                System.out.println(e.getMessage());
//            }
//        }
//
//        System.out.println();
//
//        for (int i = 0; i < trucks.length; i++) {
//            try {
//                if (!trucks[i].diagnosticCar()) {
//                    throw new RuntimeException("Автомобиль " + trucks[i].getBrand() + " " + trucks[i].getModel() + " диагностику не прошел");
//                }
//            }
//            catch (RuntimeException e) {
//                System.out.println(e.getMessage());
//            }
//        }
//        System.out.println();
//
//        for (int i = 0; i < buses.length; i++) {
//            try {
//                if (!buses[i].diagnosticCar()) {
//                    throw new RuntimeException("Автомобиль " + buses[i].getBrand() + " " + buses[i].getModel() + " диагностику не прошел");
//                }
//            }
//            catch (RuntimeException e) {
//                System.out.println(e.getMessage());
//            }
//        }
//
//        System.out.println();
//
//        for (EasyCars easyCar : easyCars) {
//            System.out.println(easyCar);
//        }
//
//        System.out.println();
//
//        for (Trucks truck : trucks) {
//            System.out.println(truck);
//        }
//
//        System.out.println();
//
//        for (Buses bus : buses) {
//            System.out.println(bus);
//        }
//
//        for (EasyCars easyCar : easyCars) {
//            easyCar.stayOnPitStop();
//            easyCar.getBestLapTime();
//            easyCar.getMaxSpeed();
//            System.out.println();
//        }
//
//        System.out.println();
//
//        for (Buses bus : buses) {
//            bus.stayOnPitStop();
//            bus.getBestLapTime();
//            bus.getMaxSpeed();
//            System.out.println();
//        }
//
//        System.out.println();
//
//        for (Trucks truck : trucks) {
//            truck.stayOnPitStop();
//            truck.getBestLapTime();
//            truck.getMaxSpeed();
//            System.out.println();
//        }


        DriverD andrey = new DriverD("Andrey", "D", 7, buses[2]);
        DriverC alexander = new DriverC("Alexander", "C", 5, trucks[1]);
        DriverB vladimir = new DriverB("Vladimir", "B", 3, easyCars[3]);
        System.out.println(alexander);
        System.out.println(andrey);
        System.out.println(vladimir);

//        easyCars[0].defineType();
//        buses[1].defineType();
//        trucks[2].defineType();

        System.out.println();



    }

    public static void carInfo(Cars car) {
        System.out.println("Автомобилем " + car.getBrand() + " " + car.getModel() + " управляет " + car.getDriver() + ".");
        System.out.println("Гонку этого автомобиля спонсирует " + car.getSponsors() + ".");
        System.out.println("Тех обслуживание и ремонт проводит" + car.getMechanics() + ".");
        System.out.println();
    }

}