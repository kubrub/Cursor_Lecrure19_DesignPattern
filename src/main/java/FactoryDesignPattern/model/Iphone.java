package FactoryDesignPattern.model;

public class Iphone extends Phone{
    private String screenDiagonal;
    private String mPOfCamera;
    private String memory;

    public Iphone(String screenDiagonal, String mPOfCamera, String memory, String modelPhone) {
        this.screenDiagonal = screenDiagonal;
        this.mPOfCamera = mPOfCamera;
        this.memory = memory;
        this.modelPhone = modelPhone;
    }

    private String modelPhone;
    @Override
    public String getScreenDiagonal() {
        return this.screenDiagonal;
    }

    @Override
    public String getMPOfCamera() {
        return this.mPOfCamera;
    }

    @Override
    public String getMemory() {
        return this.memory;
    }

    @Override
    public String getModelPhone() {
        return this.modelPhone;
    }
}
