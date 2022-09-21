package StrategyPattern;

public class Item {
    private String upcCode;
    private int price;
    private double weight;

    public Item(String upc, int cost, double weight){
        this.upcCode = upc;
        this.price = cost;
        this.weight = weight;
    }
    public String getUpcCode() {
        return upcCode;
    }

    public int getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

}
