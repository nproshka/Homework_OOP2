package Cars;

import Drivers.Driver;
import org.w3c.dom.ls.LSOutput;

public class Buses extends Cars implements Competing{
    public enum PlaceCapacity {
        VERY_SMALL("До 10"),
        SMALL("до 25"),
        AVERAGE("От 40 до 50"),
        LARGE("От 60 до 80"),
        VERY_LARGE("От 100 до 120");

        private final String places;

        PlaceCapacity(String places) {
            this.places = places;
        }

        public String getPlaces() {
            return places;
        }
    }

    private final PlaceCapacity placeCapacity;

    public Buses(String brand, String model, double engineCapacity, Driver<?> driver, PlaceCapacity placeCapacity) {
        super(brand, model, engineCapacity, driver);
        this.placeCapacity = placeCapacity;
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
    public void defineType() {
        if (placeCapacity == null) {
            System.out.println("Недостаточно данных");
        } else {
            System.out.println("Количество мест " + placeCapacity.places);
        }
    }

    @Override
    public boolean diagnosticCar() {
        System.out.println("Автобус " + getModel() + " " + getBrand() + " в диагностики не требуется");
        return true;
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

    public PlaceCapacity getPlaceCapacity() {
        return placeCapacity;
    }
}
