package com.infy.AbstractClass;

public class SoppingPayment extends RRPaymentServices {

    private static int counter=1000;
    private String paymentID;
    double dueBalance = 0;

    public SoppingPayment() {
    }

    public SoppingPayment(double balance, int customerID) {
        super(balance, customerID);

        counter++;

    }
    @Override
    public void payBill(double Amount)  {
        if (super.getBalance() > Amount){

            System.out.println("Excess Amount Entered !! please try Again");
        }
        else{
            String s = "S"+counter;
            this.paymentID=s;
            dueBalance = Amount-getBalance();
        }
        System.out.println(getCustomerID());
        System.out.println(this.paymentID);
        System.out.println(getBalance());
        System.out.println(dueBalance);
    }

    @Override
    public String toString() {
        return "SoppingPayment{" +
                "paymentID='" + paymentID + '\'' +
                '}';
    }
}
