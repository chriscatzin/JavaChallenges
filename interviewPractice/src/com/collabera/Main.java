package com.collabera;
// Christopher Catzin
// October 16, 2019

public class Main {

    public static void main(String[] args) {
	// write your code here
        int number = 50;

        for(int i = number; i >= 0; i--){
            if(i % 2 == 1){
                System.out.println(i);
            }
        }
    }
}
