package main.java.com.andreyDelay.javacore.chapter18.addressesLinkedList;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class MailList {
    public static void main(String[] args) {
        LinkedList<Address> ml = new LinkedList<>();

        ml.add(new Address("J.W. West", "11 Oak Ave", "Urbana", "IL","61801"));
        ml.add(new Address("Ralph Baker", "1142 Maple Lane", "Mahomet", "IL","61853"));
        ml.add(new Address("Tom Carlton", "867 Elm St", "Champaign", "IL","61820"));

        List<Address> list = Collections.nCopies(10,new Address("J.W. West", "11 Oak Ave", "Urbana", "IL","61801"));
        Address [] arr = new Address[10];
        list.toArray(arr);
//        System.out.println(list);

        for(Address element: arr)
            System.out.println(element + "\n");

        System.out.println();
    }
}
