package com.collabera;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo {

    public static void main(String[] args) {

        LinkedList<String> placesToVist = new LinkedList<String>();

        placesToVist.add("New York");
        placesToVist.add("St. Louis");
        placesToVist.add("Chicago");
        placesToVist.add("Dallas");
        placesToVist.add("Austin");
        placesToVist.add("San Antonio");
        placesToVist.add("Phoenix");
        placesToVist.add("Los Angeles");

        printList(placesToVist);

    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()){
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("======================");
    }
}
