package BridgeDesignPattern.figure;

import BridgeDesignPattern.colors.Color;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Rectangle extends Shape {
    public static final Logger LOGGER = LogManager.getLogger(Rectangle.class);
    public Rectangle(Color c){
        super(c);
    }
    @Override
    public void applyColor() {
        LOGGER.info("Rectangle filled with color ");
        color.applyColor();
    }
}