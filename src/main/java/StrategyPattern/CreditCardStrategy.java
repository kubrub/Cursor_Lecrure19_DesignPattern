package StrategyPattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CreditCardStrategy implements PaymentStrategy {
    public static final Logger LOGGER = LogManager.getLogger(CreditCardStrategy.class);
    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public CreditCardStrategy(String nm, String ccNum, String cvv, String expiryDate){
        this.name=nm;
        this.cardNumber=ccNum;
        this.cvv=cvv;
        this.dateOfExpiry=expiryDate;
    }
    @Override
    public void pay(int amount) {
        LOGGER.info(amount +" paid with credit/debit card");
    }
}
