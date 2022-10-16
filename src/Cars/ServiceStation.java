package Cars;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation {

    private final Queue<Cars> cars = new ArrayDeque<>(10);

    private void addCar(Cars cars) {
        this.cars.add(cars);
    }

    public void addEasyCar(EasyCars easyCar) {
        addCar(easyCar);
    }

    public void addTrucks(Trucks trucks) {
        addCar(trucks);
    }

    public void service() {
        Cars car = cars.poll();
        if (car != null) {
            car.diagnosticCar();
            if (!car.diagnosticCar()) {
                car.repairCar();
            }
        } else {
            System.out.println("Очередь пуста");
        }
    }


}
