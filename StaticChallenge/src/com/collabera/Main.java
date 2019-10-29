package com.collabera;

/********************
 * Christopher Catzin
 * Modified: October 24, 2019
 * Java Hacker Rank Problem
 */

public class Main {

    public static int multiplier = 7;

    public static void main(String[] args) {


        int answer = multiply(6);
        System.out.println("The answer is " + answer);
        System.out.println("Multiplier is " + multiplier);

    }

    public static int multiply(int number) {
        return number * multiplier;
    }
}
