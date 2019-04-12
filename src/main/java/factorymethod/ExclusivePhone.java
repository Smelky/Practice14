package factorymethod;

import org.apache.log4j.Logger;

public class ExclusivePhone implements Phone {
    private static final Logger LOGGER = Logger.getLogger(ExclusivePhone.class);
    private static final Object sync = new Object();
    private static volatile ExclusivePhone instance;
    private String processor = "Exynos 992";
    private int ram = 32;
    private int memory = 1000;
    private float screen = 8.2f;
    private String chargePort = "Type-C";
    private int camera = 108;

    private ExclusivePhone() {
    }

    public static ExclusivePhone getExclusivePhone() {
        if (instance == null) {
            synchronized (sync) {
                if (instance == null) {
                    instance = new ExclusivePhone();
                }
            }

        }
        return instance;
    }

    public void getPhoneCharacters() {
        LOGGER.info("Characters of Exclusive Phone");
        LOGGER.info("Processor: " + processor);
        LOGGER.info("RAM: " + ram);
        LOGGER.info("Memory: " + memory);
        LOGGER.info("Screen: " + screen);
        LOGGER.info("Charge port: " + chargePort);
        LOGGER.info("Camera: " + camera);
    }
}
