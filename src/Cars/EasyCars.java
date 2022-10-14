package Cars;

import java.util.Locale;

public class EasyCars extends Cars implements Competing  {
    public enum Body { SEDAN, HATCHBACK, COUPE, UNIVERSAL, SUV, CROSSOVER, PICKUP, VAN, MINIVAN }

    private final Body body;

    public EasyCars(String brand, String model, double engineCapacity, Body body) {
        super(brand, model, engineCapacity);
        this.body = body;
    }

    @Override
    public void defineType() {
        if (body == null) {
            System.out.println("Недостаточно данных");
        } else {
            System.out.println("Тип кузова " + body);
        }
    }

    @Override
    public boolean diagnosticCar() {
        return !(getEngineCapacity() < 2.0);
    }

    @Override
    public void startMoving() {
        System.out.println("Начинаю движение");
    }

    @Override
    public void endMoving() {
        System.out.println("Заканчиваю движение");
    }

    @Override
    public void stayOnPitStop() {
        System.out.println("Это " + getBrand() + " " + getModel() + " встаю на ПитСтоп!");
    }

    @Override
    public void getBestLapTime() {
        System.out.println("Время лучшего круга " + getBrand() + " " + getModel());
    }

    @Override
    public void getMaxSpeed() {
        System.out.println("Максимальная скорость " + getBrand() + " " + getModel());
    }

    public Body getBody() {
        return body;
    }
}
