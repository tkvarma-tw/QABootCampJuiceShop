package com.qabootcamp.models;

public class OrderCheckout {

    public OrderCheckout(String paymentMethod) {
        placeOrder();
        if(paymentMethod.equals("credit_card"))
            new OrderCheckoutWithCreditCard().pay();
        else
            new OrderCheckoutwithWallet().pay();
    }

    public void placeOrder()
    {
        addProduct();
        addAddress();
    }

    private void addProduct() {
    }

    private void addAddress() {
    }
}
