package com.collabera;

// Christopher Catzin
// Modified: November 16, 2019
// This needs some work still.

public class Customer {

    private String name;
    private double balance;

    public Customer(String name, double balance){
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
