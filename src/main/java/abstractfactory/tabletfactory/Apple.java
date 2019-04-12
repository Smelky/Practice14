package abstractfactory.tabletfactory;

import org.apache.log4j.Logger;

public class Apple implements Tablet {
    private static final Logger LOGGER = Logger.getLogger(Apple.class);
    public void work() {
        LOGGER.info("Apple is working");
    }
}
