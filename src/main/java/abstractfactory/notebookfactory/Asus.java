package abstractfactory.notebookfactory;

import org.apache.log4j.Logger;

public class Asus implements Notebook {

    private static final Logger LOGGER = Logger.getLogger(Asus.class);
    @Override
    public void work() {
        LOGGER.info("Apple is working");
    }
}
