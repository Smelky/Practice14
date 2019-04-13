package factorymethod;

import org.apache.log4j.Logger;

public class PhoneCopy implements Phone {
    private static final Logger LOGGER = Logger.getLogger(PhoneCreator.class);

    private ExclusivePhone exclusivePhone = ExclusivePhone.getExclusivePhone();

    @Override
    public void getPhoneCharacters() {
        LOGGER.info("It is a chinese copy of this phone");
        exclusivePhone.getPhoneCharacters();
    }
}
