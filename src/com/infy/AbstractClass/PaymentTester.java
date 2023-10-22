package com.infy.AbstractClass;

public class PaymentTester {
    public static void main(String[] args) {
        //RRPaymentServices rrPaymentServices = new SoppingPayment(10000.23,5001);
       // rrPaymentServices.payBill(15000);
        //System.out.println(rrPaymentServices);
        RRPaymentServices rrPaymentServices1 = new CreditCardPayment(10000.23,5001);
        rrPaymentServices1.payBill(0);
        System.out.println(rrPaymentServices1);

    }
}
