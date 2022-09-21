package BridgeDesignPattern.colors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class YellowColor implements Color{
    public static final Logger LOGGER = LogManager.getLogger(YellowColor.class);
    public void applyColor(){
        LOGGER.info("yellow.");
    }
}
