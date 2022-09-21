package BridgeDesignPattern;

import BridgeDesignPattern.colors.*;
import BridgeDesignPattern.figure.*;

public class Main {
    public static void main(String[] args) {
        Shape tri = new Triangle(new BlueColor());
        tri.applyColor();

        Shape сircle = new Сircle(new YellowColor());
        сircle.applyColor();

        Shape rectangle = new Rectangle(new BrownColor());
        rectangle.applyColor();
    }
}
