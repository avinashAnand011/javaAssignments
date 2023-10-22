package com.infy.TypeCasting;

public class TypCasting {
    public static void main(String[] args) {
        int billId;
        int customerId;
        int discount;
        double billAmount;
        double discountedBillAmount;
        billId=1001;
        System.out.println("billId "+ billId);
        customerId=101;
        System.out.println("customerId " + customerId);
        discount=2;
        billAmount=100;

        discountedBillAmount = billAmount-(billAmount*((double)discount/100));

        System.out.println("Discounted Bill Amount "+ discountedBillAmount);

    }
}
