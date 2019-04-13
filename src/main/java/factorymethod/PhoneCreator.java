package factorymethod;

import org.apache.log4j.Logger;

public class PhoneCreator implements Phone {

    private static final Logger LOGGER = Logger.getLogger(PhoneCreator.class);

    private final String processor;
    private final int ram;
    private final int memory;
    private final float screen;
    private final String chargePort;
    private final int camera;

    private PhoneCreator(Builder builder) {
        this.processor = builder.processor;
        this.ram = builder.ram;
        this.memory = builder.memory;
        this.screen = builder.screen;
        this.chargePort = builder.chargePort;
        this.camera = builder.camera;
    }

    static class Builder {
        private String processor;
        private int ram;
        private int memory;
        private float screen;
        private String chargePort;
        private int camera;

        public Builder withProcessor(String processor) {
            this.processor = processor;
            return this;
        }

        public Builder withRam(int ram) {
            this.ram = ram;
            return this;
        }

        public Builder withMemory(int memory) {
            this.memory = memory;
            return this;
        }

        public Builder withScreen(float screen) {
            this.screen = screen;
            return this;
        }

        public Builder withChargePort(String chargePort) {
            this.chargePort = chargePort;
            return this;
        }

        public Builder withCamera(int camera) {
            this.camera = camera;
            return this;
        }

        public PhoneCreator build() {
            return new PhoneCreator(this);
        }
    }

    @Override
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
