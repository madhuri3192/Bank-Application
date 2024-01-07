package com.bank;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

public class Main {

	private static Object depositeMoney;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hi Program started from here...");
		
		boolean flag = true;
		while(flag) {
			System.out.println("You're on Dashboard");
		    System.out.println("Press 1 for create new account");
		    System.out.println("Press 2 for check balance");
		    System.out.println("press 3 for deposite money");
		    System.out.println("press 4 for withdrawl money");
		    System.out.println("press 5 for exit from application");
			int value = sc.nextInt();
			switch(value) {
				case 1: accountCreation(sc);break;
				case 2: checkBalance(sc);break;
//				case 3: depositeMoney;break;
//				case 4: withdrawlMoney();break;
				case 5: flag=false;break;
				default:System.out.println("wrong choicce, please try again.");
			}
		}

	    

		
	

	}

	private static void checkBalance(Scanner sc) {
		System.out.println("Choose your bank,"
				+ "\nyour options are given below:-"
				+ " \n \t 1) IndiaBank \n \t 2) Bank Of India Bank \\t 3) Bank Of Baroda Bank");
		System.out.println("please enter value accordingly ");
		int bankNumber = sc.nextInt();
		if(bankNumber == 1 ) {
			System.out.println("please enter your account number");
			String accNum =sc.next();
			Account account = IndianBank.getAccount(accNum);
			System.out.println("your balance is: "+ account.getBalance());	
		}else {
			System.out.println("testing.. Other banks are not implemented");
		}
		
	}

	private static void accountCreation(Scanner sc) {
		System.out.println("In which Bank you want to create your Account");
		System.out.println("your options are given below:-"
				+ " \n \t 1) IndiaBank \n \t 2) Bank Of India Bank \\t 3) Bank Of Baroda Bank");
		System.out.println("please enter value accordingly ");
		int bankNumber = sc.nextInt();

		switch (bankNumber) {
		case 1:
			createAccount(Account.indianBank, sc);
			break;
		case 2:
			createAccount(Account.boiBank, sc);
			break;
		case 3:
			createAccount(Account.bobBank, sc);
			break;
		case 4:
			System.out.println("program ended, Thank you");
			break;
		default:
			System.out.println("wrong choice, please enter valid value");
		}
	}

	private static void createAccount(String bank, Scanner sc) {
		Account ac = new Account();
		ac.setId(UUID.randomUUID().toString());
		System.out.println("Please enter account holder name");
		sc.nextLine();
		String name = sc.nextLine();
		ac.setAccountName(name);
		ac.setAccountOpeningDate(new Date());
		ac.setAccountNumber((bank.equals(Account.indianBank) ? IndianBank.bankCode : "BANK") + new Random(10000).nextInt());
		System.out.println("please Enter Address");
		ac.setAddress(sc.nextLine());
		ac.setBalance(100);
		IndianBank.addAccount(ac);
		System.out.println("Account is Created");
		System.out.println("ur acc num is: "+ ac.getAccountNumber());
	}
}
