package com.montran.main;

import java.util.Scanner;

import com.montran.pojo.Account;

public class AccountMainV2 {
 public static void main(String[] args) {
	Account account=new Account();
	Scanner scanner=new Scanner(System.in);
	account.setAccountNumber(123);
	account.setName("Sohan");
	account.setBalance(12000.0);
	System.out.println(account);
	
	
	System.out.println("Account Number:"+account.getAccountNumber());
	System.out.println("Name:"+account.getName());
	System.out.println("Balance:"+account.getBalance());
	
	System.out.println("Enter amount to withdraw");
	int amount=scanner.nextInt();
	
	if(account.withdraw(amount)) {
		System.out.println("Transaction Success");
	}else {
		System.out.println("Transaction Failed");
	}
	
	System.out.println(account);
	System.out.println("Enter amount to deposit");
	amount=scanner.nextInt();
	if(account.deposit(amount)) {
		System.out.println("Transaction Success");
	}else {
		System.out.println("Transaction Failed");
	}
	
	System.out.println(account);
}
}
