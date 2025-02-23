package com.collabera;

import java.util.ArrayList;

public class arrayList {

    private ArrayList<String> groceryList = new ArrayList<String>();

    public static void main(String[] args){

    }

    public void addGroceryItem(String item){
        groceryList.add(item);

    }

    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items" +
                " in you grocery list!");
        for(int i = 0; i < groceryList.size(); i++){
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) +
                " has been modified.");
    }

    public void removeGroceryItem(int position){
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }
}
