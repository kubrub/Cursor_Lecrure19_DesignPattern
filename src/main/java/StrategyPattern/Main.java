package StrategyPattern;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1234",10, 0.55);
        Item item2 = new Item("5678",40, 1.345);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.pay(new PaypalStrategy("myemail@example.com", "password"));

        cart.pay(new CreditCardStrategy("Anastasiia Kovalchuk", "12345678876453", "654", "12/26"));
    }
}
