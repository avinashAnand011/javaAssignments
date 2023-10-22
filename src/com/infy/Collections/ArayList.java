package com.infy.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ArayList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("B");
        list.add("C");
        list.add("A");
        //list.add(new String("rishi"));
        /*ListIterator<list> listIterator = list.listIterator();
        while (listIterator.hasNext()){
            list reverse = listIterator.hasPrevious();
            System.out.println(reverse);*/
            Collections.reverse(list);
           // Collections.sort(list);
            System.out.println(list);

        }

    }