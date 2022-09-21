package BridgeDesignPattern.figure;

import BridgeDesignPattern.colors.Color;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Сircle extends Shape {
    public static final Logger LOGGER = LogManager.getLogger(Сircle.class);
    public Сircle(Color c){
        super(c);
    }
    @Override
    public void applyColor() {
        LOGGER.info("Сircle filled with color ");
        color.applyColor();
    }
}
