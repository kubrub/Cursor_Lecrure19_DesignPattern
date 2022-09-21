package BridgeDesignPattern.figure;

import BridgeDesignPattern.colors.Color;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Triangle extends Shape {
    public static final Logger LOGGER = LogManager.getLogger(Triangle.class);
    public Triangle(Color c) {
        super(c);
    }

    @Override
    public void applyColor() {
        LOGGER.info("Triangle filled with color ");
        color.applyColor();
    }
}
