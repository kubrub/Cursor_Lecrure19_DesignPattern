package BridgeDesignPattern.colors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class BlueColor implements Color {
    public static final Logger LOGGER = LogManager.getLogger(BlueColor.class);
    public void applyColor(){
        LOGGER.info("blue.");
    }
}