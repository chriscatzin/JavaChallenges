package com.collabera;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

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

        placesToVist.add(1, "Portland");
        printList(placesToVist);

        placesToVist.remove(4);
        printList(placesToVist);

    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()){
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("======================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while(stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison == 0){
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if(comparison > 0){
                // new city should appear before this one
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if(comparison < 0){
                // move on to the next city

            }
        }
        stringListIterator.add(newCity);
    }
}
