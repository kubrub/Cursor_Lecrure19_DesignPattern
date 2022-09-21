package FactoryDesignPattern.factory;

import FactoryDesignPattern.model.Iphone;
import FactoryDesignPattern.model.Phone;
import FactoryDesignPattern.model.Samsung;

public class PhoneFactory {
    public static Phone getPhone(String type, String screenDiagonal, String mPOfCamera, String memory, String modelPhone){
        if ("Samsung".equalsIgnoreCase(type)) return new Samsung(screenDiagonal, mPOfCamera, memory, modelPhone);
        else if("Iphone".equalsIgnoreCase(type)) return new Iphone(screenDiagonal, mPOfCamera, memory, modelPhone);
        return null;
    }
}
