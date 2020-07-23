package com.montran.main;

import java.util.Scanner;

import com.montran.pojo.Account;

public class AccountMainV3 {
   public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int accountNumber;
	String name,continueChoice;
	double balance;
	int amount;
	int trasactionChoice;
	boolean result;
	System.out.println("Hello Welcome to XYZ bank");
	System.out.println("Enter account number");
	accountNumber=scanner.nextInt();
	System.out.println("Enter name");
	name=scanner.next();
	System.out.println("Enter balance");
	balance=scanner.nextDouble();
	Account account=new Account();
	account.setAccountNumber(accountNumber);
	account.setName(name);
	account.setBalance(balance);
	do {
	System.out.println("Menu");
	System.out.println("1.Withdraw");
	System.out.println("2.Deposite");
	System.out.println("3.Balance");
	System.out.println("Enter your choice");
	trasactionChoice=scanner.nextInt();
	switch (trasactionChoice) {
	case 1:
		System.out.println("Enter amount to withdraw");
		amount=scanner.nextInt();
		result= account.withdraw(amount);
		if(result)
			System.out.println("Transaction Sucess");
		else
			System.out.println("Transaction Failed");
		break;
	case 2:
		System.out.println("Enter amount to deposit");
		amount=scanner.nextInt();
		result= account.deposit(amount);
		if(result)
			System.out.println("Transaction Sucess");
		else
			System.out.println("Transaction Failed");
		break;
	case 3 :System.out.println("Account balance::" +account.getBalance());
	break;
	default:
		System.out.println("Invalid Choice");
		break;
		
	}
	System.out.println("DO you want continue [yes]");
	continueChoice=scanner.next();
	}while(continueChoice.equals("yes"));
	scanner.close();
}
}
