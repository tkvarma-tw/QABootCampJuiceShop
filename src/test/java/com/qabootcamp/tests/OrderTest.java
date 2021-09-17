package com.qabootcamp.tests;

import com.qabootcamp.models.OrderCheckout;
import org.testng.annotations.Test;

public class OrderTest extends BastTest{

    @Test
    public void placeOrderwithCreditCard()
    {
        new OrderCheckout("CreditCard");
    }
    @Test
    public void placeOrderwithWallet()
    {
        new OrderCheckout("Wallet");
    }
}
