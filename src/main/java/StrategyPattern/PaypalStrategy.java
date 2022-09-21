package StrategyPattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PaypalStrategy implements PaymentStrategy {
    public static final Logger LOGGER = LogManager.getLogger(PaypalStrategy.class);
    private String emailId;
    private String password;

    public PaypalStrategy(String email, String pwd){
        this.emailId=email;
        this.password=pwd;
    }

    @Override
    public void pay(int amount) {
        LOGGER.info(amount + " paid using Paypal.");
    }

}