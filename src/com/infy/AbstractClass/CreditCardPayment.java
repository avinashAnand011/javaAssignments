package com.infy.AbstractClass;

public class CreditCardPayment extends RRPaymentServices {

    private static int counter=1000;
    private String paymentID;
    private double cashBack;
    private double balanceDue;

    public CreditCardPayment(double balance, int customerID) {
        super(balance, customerID);
        counter++;
    }

    @Override
    public void payBill(double Amount){
            if(Amount> getBalance()){
                cashBack= Amount-getBalance();
            }
            else {
                balanceDue=getBalance()-Amount;
            }
            String s = "C"+counter;
            setPaymentID(s);
        System.out.println(getCustomerID());
        System.out.println(this.paymentID);
        System.out.println(getBalance());
        System.out.println( cashBack);
        System.out.println(getPaymentID());
    }


    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        CreditCardPayment.counter = counter;
    }

    public String getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(String paymentID) {
        this.paymentID = paymentID;
    }

    public double getCashBack() {
        return cashBack;
    }

    public void setCashBack(double cashBack) {
        this.cashBack = cashBack;
    }

    public double getBalanceDue() {
        return balanceDue;
    }

    public void setBalanceDue(double balanceDue) {
        this.balanceDue = balanceDue;
    }

    @Override
    public String toString() {
        return "CreditCardPayment{" +
                "paymentID='" + paymentID + '\'' +
                ", cashBack=" + cashBack +
                ", balanceDue=" + balanceDue +
                '}';
    }
}
