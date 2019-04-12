package adapter;

import org.apache.log4j.Logger;

public class Washer {
    private static final Logger LOGGER = Logger.getLogger(Washer.class);

    public void washing(Car car) {
        car.wash();
    }
}
