package BridgeDesignPattern.colors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class BrownColor implements Color{
    public static final Logger LOGGER = LogManager.getLogger(BrownColor.class);
    public void applyColor(){
        LOGGER.info("brown.");
    }
}