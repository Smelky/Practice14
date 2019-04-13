package prototype;

import factorymethod.PhoneCreator;
import org.apache.log4j.Logger;

public class Student implements Cloneable{
    private static final Logger LOGGER = Logger.getLogger(PhoneCreator.class);

    public Student clone() {
        try {
            return (Student)super.clone();
        } catch (CloneNotSupportedException e) {
            LOGGER.error(e.getMessage());
        }
        return null;
    }
}
