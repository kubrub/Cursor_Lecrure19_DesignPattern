package FactoryDesignPattern.model;

public abstract class Phone {
    public abstract String getScreenDiagonal();
    public abstract String getMPOfCamera();
    public abstract String getMemory();
    public abstract String getModelPhone();

    @Override
    public String toString(){return "[Phone model - " + this.getModelPhone() +
            ", screen diagonal - " + this.getScreenDiagonal() +
            ", main camera - " + this.getMPOfCamera() + " MP, phone memory - "
            + this.getMemory() + "]";}
}
