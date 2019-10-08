package com.collabera;

public class Main {

    public static void main(String[] args) {
		Account chrisAccount = new Account("Chris");
		chrisAccount.deposit(1000);
		chrisAccount.withdraw(500);
		chrisAccount.withdraw(-200);
		chrisAccount.deposit(-20);
		chrisAccount.calculateBalance();
		//chrisAccount.balance = 5000;

		System.out.println("Balance on account is " + chrisAccount.getBalance());
		//chrisAccount.transactions.add(4500);
		chrisAccount.calculateBalance();
    }
}
