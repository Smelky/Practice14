package factorymethod;

import org.apache.log4j.Logger;

public class PhoneCreator implements Phone {

    private static final Logger LOGGER = Logger.getLogger(PhoneCreator.class);
    private String processor;
    private int ram;
    private int memory;
    private float screen;
    private String chargePort;
    private int camera;

    private PhoneCreator(Creator builder) {
        this.processor = builder.processor;
        this.ram = builder.ram;
        this.memory = builder.memory;
        this.screen = builder.screen;
        this.chargePort = builder.chargePort;
        this.camera = builder.camera;
    }

    static class Creator {
        private String processor;
        private int ram;
        private int memory;
        private float screen;
        private String chargePort;
        private int camera;

        public Creator processor(String processor) {
            this.processor = processor;
            return this;
        }

        public Creator ram(int ram) {
            this.ram = ram;
            return this;
        }

        public Creator memory(int memory) {
            this.memory = memory;
            return this;
        }

        public Creator screen(float screen) {
            this.screen = screen;
            return this;
        }

        public Creator chargePort(String chargePort) {
            this.chargePort = chargePort;
            return this;
        }

        public Creator camera(int camera) {
            this.camera = camera;
            return this;
        }

        public PhoneCreator build() {
            return new PhoneCreator(this);
        }
    }

    public void getPhoneCharacters() {
        LOGGER.info("Characters of your phone");
        LOGGER.info("Processor: " + processor);
        LOGGER.info("RAM: " + ram);
        LOGGER.info("Memory: " + memory);
        LOGGER.info("Screen: " + screen);
        LOGGER.info("Charge port: " + chargePort);
        LOGGER.info("Camera: " + camera);
    }
}
