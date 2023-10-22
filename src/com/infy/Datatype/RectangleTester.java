package com.infy.Datatype;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.security.spec.RSAOtherPrimeInfo;

public class RectangleTester {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(20);
        rectangle.setBreadth(20);
        System.out.println("The area of Rectangle = "+ rectangle.getLength() * rectangle.getBreadth());
    }
}
