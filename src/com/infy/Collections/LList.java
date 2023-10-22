package com.infy.Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Rishi");
        linkedList.add("Vishi");
        linkedList.add("Ishi");
        linkedList.add("Kishi");

        for (int i =0; i<linkedList.size(); i++){
            System.out.println(linkedList.get(i));
        }

        linkedList.remove(0);
        linkedList.remove(linkedList.size()-1);

        System.out.println("-------------------------------------------------------");

        for (String list: linkedList)
        {
            System.out.println(list);
        }

        System.out.println("--------------------------------------------------------");

        linkedList.add(0,"Naman");
        linkedList.add("Nirmal");

        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
        }

    }
}
