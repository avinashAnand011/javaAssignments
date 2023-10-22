package com.infy.Generics;

import java.util.ArrayList;
import java.util.List;

public class SimpleGenericsTester {
    public static void main(String[] args) {
       SimpleGenerics<Object> generics= new SimpleGenerics<>(2);
       SimpleGenerics<Object> generics1 = new SimpleGenerics<>("Rekhsa");
        generics1.showObjectType();
        generics.showObjectType();

        /*List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add("as");*/
    }
}

