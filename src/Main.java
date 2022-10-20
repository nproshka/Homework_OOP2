import Cars.*;
import Drivers.Driver;
import Drivers.DriverB;
import Drivers.DriverC;
import Drivers.DriverD;
import Cars.EasyCars.Body;
import Cars.Buses.PlaceCapacity;
import Cars.Trucks.LoadCapacity;
import SuperMarket.SuperMarket;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Mechanic<EasyCars> volodya = new Mechanic<EasyCars>("Филин Владимир", "'Легковые автомобили+'");
        Mechanic<Trucks> nikita = new Mechanic<Trucks>("Алексеева Никита", "'Энергия'");
        Mechanic<Buses> genady = new Mechanic<Buses>("Горин Геннадий", "'Вип Авто'");
        Mechanic<Cars> vadim = new Mechanic<Cars>("Шевелев Вадим", "'Всё правильно'");

        Set<Mechanic<?>> mechanics = new HashSet<>(List.of(volodya, vadim, nikita, volodya));
        System.out.println("Список механиков - " + mechanics);

        Sponsor redBull = new Sponsor("Red Bull", 300_000);
        Sponsor gasprom = new Sponsor("Газпром", 1_000_000);
        Sponsor motul = new Sponsor("Motul", 100_000);
        Sponsor lykoil = new Sponsor("Лукойл", 350_000);

        Set<Sponsor> sponsors = new HashSet<>(List.of(redBull, gasprom, motul, lykoil, redBull));
        System.out.println("Список спонсоров - " + sponsors);

        DriverB stepan = new DriverB("Степан", "B", 9);
        DriverC igor = new DriverC("Игорь", "С", 5);
        DriverD roman = new DriverD("Роман", "D", 12);

        Set<Driver<?>> drivers = new HashSet<>(List.of(stepan, igor, roman, igor));
        System.out.println("Список Водителей - " + drivers);


        EasyCars[] easyCars = new EasyCars[4];
//        easyCars[0] = new EasyCars("Volkswagen", "Taos", 1.4, null);
//        easyCars[1] = new EasyCars("Volkswagen", "Tiguan", 1.4, Body.HATCHBACK);
//        easyCars[2] = new EasyCars("Chevrolet", "Camaro", 6.2, Body.SEDAN);
        easyCars[3] = new EasyCars("BMW", "X5", 1.1, stepan, Body.HATCHBACK);

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

        Set<Cars> cars = new HashSet<Cars>(List.of(easyCars[3], trucks[1], buses[2], trucks[1]));
        System.out.println("Список машин учавствующих в гонке следующий - " + cars);


//        for (Cars car : cars) {
//            carInfo(car);
//        }

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addEasyCar(easyCars[3]);
        serviceStation.service();



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

//        DriverD andrey = new DriverD("Andrey", "D", 7, buses[2]);
//        DriverC alexander = new DriverC("Alexander", "C", 5, trucks[1]);
//        DriverB vladimir = new DriverB("Vladimir", "B", 3, easyCars[3]);
//        System.out.println(alexander);
//        System.out.println(andrey);
//        System.out.println(vladimir);
//
//        easyCars[0].defineType();
//        buses[1].defineType();
//        trucks[2].defineType();

//        System.out.println();
//
//        SuperMarket superMarket = new SuperMarket();
//
//        Queue<String> queue1 = new ArrayDeque<>(5);
//        Queue<String> queue2 = new ArrayDeque<>(5);
//
//        superMarket.randomFilling(queue1);
//        superMarket.randomFilling(queue2);
//
//        System.out.println("Первая очередь " + queue1);
//        System.out.println("Первая очередь " + queue2);
//
//        System.out.println();
//
//        superMarket.add("Пупкин Вася", queue1, queue2);
//
//        System.out.println("Первая очередь " + queue1);
//        System.out.println("Первая очередь " + queue2);
//
//        System.out.println();
//
//        superMarket.remove(queue1, queue2);
//        System.out.println("Первая очередь " + queue1);
//        System.out.println("Первая очередь " + queue2);
//
//        example();

        Set<String> equations = new HashSet<>();

        for (int i = 0; i < 16; i++) {
            equations.add(getRandomEquation());
        }

        System.out.println(equations.toString().replace("[", "").replace("]", "").replace(", ", ""));


    }

    private static void example() {
        List<List<String>> biDemArrList = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            biDemArrList.add(i, new ArrayList<>());
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 1) {
                    biDemArrList.get(i).add(j, "●");
                } else {
                    biDemArrList.get(i).add(j, "◯");
                }
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(biDemArrList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }


    public static void carInfo(Cars car) {
        System.out.println("Автомобилем " + car.getBrand() + " " + car.getModel() + " управляет " + car.getDriver() + ".");
        System.out.println("Гонку этого автомобиля спонсирует " + car.getSponsors() + ".");
        System.out.println("Тех обслуживание и ремонт проводит" + car.getMechanics() + ".");
        System.out.println();
    }

    public static String getRandomEquation() {
        int firstNum = (int) (Math.random() * 8) + 2;
        int secondNum = (int) (Math.random() * 8) + 2;
        return firstNum + " * " + secondNum + "\n";
    }

}