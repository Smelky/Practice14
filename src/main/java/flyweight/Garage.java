package flyweight;

import java.util.HashMap;
import java.util.Map;

public class Garage {
    private Map<String, Car> carGarage = new HashMap<String, Car>();

    public Car getCar(String color){
        Car car = carGarage.get(color);
        if(car == null){
            car = new Car();
            car.setColor(color);
            carGarage.put(color, car);
        }
        return car;
    }
}
