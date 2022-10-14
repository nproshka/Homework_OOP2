package Cars;

public class Trucks extends Cars implements Competing {
    public enum LoadCapacity {
        N1("Масса до 3,5 тонн"),
        N2("Масса свыше 3,5 до 12 тонн"),
        N3("Масса свыше 12 тонн");

        private final String weight;

        LoadCapacity(String weight) {
            this.weight = weight;
        }

        public String getWeight() {
            return weight;
        }
    }

    private final LoadCapacity loadCapacity;

    public Trucks(String brand, String model, double engineCapacity, LoadCapacity loadCapacity) {
        super(brand, model, engineCapacity);
        this.loadCapacity = loadCapacity;
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
        if (loadCapacity == null) {
            System.out.println("Недостаточно данных");
        } else {
            System.out.println("Грузоподъёмность " + loadCapacity.weight);
        }
    }

    @Override
    public boolean diagnosticCar() {
        return !(getEngineCapacity() < 5.0);
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
