package FactoryDesignPattern;

import FactoryDesignPattern.factory.PhoneFactory;
import FactoryDesignPattern.model.Phone;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Main {
    public static final Logger LOGGER = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        Phone samsung = PhoneFactory.getPhone("Samsung", "5,6", "22", "126", "galaxy s9");
        Phone iphone = PhoneFactory.getPhone("Iphone", "5,5", "23", "256", "13 Pro Max");
        LOGGER.info("Factory Samsung Config - " + samsung);
        LOGGER.info("Factory IPhone Config - " + iphone);
    }
}
