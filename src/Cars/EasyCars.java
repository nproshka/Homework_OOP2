package Cars;

import java.util.Locale;

public class EasyCars extends Cars implements Competing  {
    public EasyCars(String brand, String model, double engineCapacity) {
        super(brand, model, engineCapacity);
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
}
