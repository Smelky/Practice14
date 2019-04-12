package adapter;

import org.apache.log4j.Logger;

public class MyTrack implements Track {

    private static final Logger LOGGER = Logger.getLogger(Washer.class);

    public void clean() {
    LOGGER.info("Wash track");
    }
}
