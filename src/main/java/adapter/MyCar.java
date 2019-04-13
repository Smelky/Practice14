package adapter;

import org.apache.log4j.Logger;

public class MyCar implements Car {
    private static final Logger LOGGER = Logger.getLogger(Washer.class);

    @Override
    public void wash() {
    LOGGER.info("Wash car");
    }
}
