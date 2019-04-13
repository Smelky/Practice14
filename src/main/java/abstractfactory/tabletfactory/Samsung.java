package abstractfactory.tabletfactory;

import org.apache.log4j.Logger;

public class Samsung implements Tablet {

    private static final Logger LOGGER = Logger.getLogger(Samsung.class);
    @Override
    public void work() {
        LOGGER.info("Samsung is working");
    }
}
