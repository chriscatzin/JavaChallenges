package com.collabera;

// Christopher Catzin
// Modified: November 1, 2019

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        LinkedList<String> placesToVist = new LinkedList<String>();

        addInOrder(placesToVist, "New York");
        addInOrder(placesToVist, "St. Louis");
        addInOrder(placesToVist, "Chicago");
        addInOrder(placesToVist, "Dallas");
        addInOrder(placesToVist, "Austin");
        addInOrder(placesToVist, "San Antonio");
        addInOrder(placesToVist, "Los Angeles");


        addInOrder(placesToVist, "San Pedro");
        addInOrder(placesToVist, "Los Angeles");
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
                // equal, do not add
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if(comparison > 0){
                // new city should appear before this one
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if(comparison < 0){
                // move on to the next
                // city

            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.getFirst() == ""){
            System.out.println("No cities inputed.");
            return;
        }else{
            System.out.println("Now Visiting " + listIterator.next());
            printMenu();
        }

        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            case 0:
                System.out.println("Holiday (");
        }
    }
}
