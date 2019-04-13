package abstractfactory.notebookfactory;

import org.apache.log4j.Logger;

public class Lenovo implements Notebook {

    private static final Logger LOGGER = Logger.getLogger(Lenovo.class);
    
    @Override
    public void work() {
        LOGGER.info("Samsung is working");
    }
}
