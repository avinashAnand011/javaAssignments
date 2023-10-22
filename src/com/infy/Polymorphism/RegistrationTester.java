package com.infy.Polymorphism;

public class RegistrationTester {
    public static void main(String[] args) {
       Registration registration = new Registration("Kevin","MN9891N", new long[]{9452425421L, 7676765252L});
       Registration registration1 = new Registration("julias", 123, "PN7878", new long[] {345737543453L,34533753547L});
       Registration registration2 = new Registration("jammy", "7456784", new long[] { 757438234L,2345346456L});
       Registration registration3 = new Registration("rose", "OHDFG6886", new long[] {34554346L,3524567L});
        System.out.println(registration);
        System.out.println(registration1);
        System.out.println(registration2);
        System.out.println(registration3);
    }
}
