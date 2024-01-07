package com.bank;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

public class Main {
	public static int bank = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hi Program started from here...");
		System.out.println("Please select your bank.");
		bank = takeBank(sc);
		
		boolean flag = true;
		while(flag) {
			System.out.println("You're on Dashboard");
		    System.out.println("Press 1 for create new account");
		    System.out.println("Press 2 for check balance");
		    System.out.println("press 3 for deposite money");
		    System.out.println("press 4 for withdrawl money");
		    System.out.println("press 5 for check transactions of account");
		    System.out.println("press 6 for proceed with other bank");
		    System.out.println("press 7 for exit from application");
			int value = sc.nextInt();
			switch(value) {
				case 1: createBankAccount(sc,bank);break; 
				case 2: checkBalance(sc,bank);break;
				case 3: depositeMoney(sc,bank);break;
				case 4: withdrawlMoney(sc,bank);break;
				case 5: showTransactions(sc,bank); break;
				case 6: takeBank(sc);break;
				case 7: flag=false;
						System.out.println("Application going down");
						break;
				default:System.out.println("wrong choicce, please try again.");
			}
		}

	    

		
	

	}

	private static void showTransactions(Scanner sc, int bank2) {
		if(bank == 1 ) {
			System.out.println("please enter your account number");
			String accNum =sc.next();
			Account account = IndianBank.getAccount(accNum);
			if(account==null) {
				System.out.println("Account not found, \nPlease try with differnet account number");
				return;
			}
			System.out.println("your transaction history: \n"+ "-> " + account.getTransactions());
		}else {
			System.out.println("testing.. Other banks are not implemented");
		}
	}

	private static int takeBank(Scanner sc){
		while(true) {
			System.out.println("Choose your bank,"
					+ "\nyour options are given below:-"
					+ " \n \t 1) IndiaBank \n \t 2) Bank Of India Bank \n \t 3) Bank Of Baroda Bank");
			int bank = sc.nextInt();
			if(bank>3 || bank<=0) {
				System.out.println("Invaild choice, please try again");
			}else 
				return bank;
		}	
	}

	private static void withdrawlMoney(Scanner sc, int bank) {
		if(bank == 1 ) {
			System.out.println("please enter your account number");
			String accNum =sc.next();
			Account account = IndianBank.getAccount(accNum);
			System.out.println("please enter ammount for withdrawl");
			if(account==null) {
				System.out.println("Account not found, \nPlease try with differnet account number");
				return;
			}
			int ammount = sc.nextInt();
			if( account.getBalance() < ammount) {
				System.out.println("Insufficient Balance,\n Please try under current balance,\n balance is: "+ account.getBalance());
				withdrawlMoney(sc,bank);
			}else {
				account.setBalance( account.getBalance() - ammount );
				account.addTransaction(-1 * ammount);
				System.out.println("ammount withdrawled");
			}
		}else {
			System.out.println("testing.. Other banks are not implemented");
		}
	}



	private static void depositeMoney(Scanner sc, int bank) {
		if(bank == 1 ) {
			System.out.println("please enter your account number");
			String accNum =sc.next();
			Account account = IndianBank.getAccount(accNum);
			if(account==null) {
				System.out.println("Account not found, \nPlease try with differnet account number");
				return;
			}
			System.out.println("please enter ammount for deposite");
			int ammount = sc.nextInt();
			account.setBalance( account.getBalance() + ammount );
			account.addTransaction(ammount);
			System.out.println("Ammount added to your account \n\n");
		}else {
			System.out.println("testing.. Other banks are not implemented");
		}
		
	}

	private static void checkBalance(Scanner sc, int bank) {
		if(bank == 1) {
			System.out.println("please enter your account number");
			String accNum =sc.next();
			Account account = IndianBank.getAccount(accNum);
			if(account==null) {
				System.out.println("Account not found, \nPlease try with differnet account number");
				return;
			}
			System.out.println("your balance is: "+ account.getBalance());	
			System.out.println("\n\n");
		}else  {
			System.out.println("testing.. Other banks are not implemented");
			//please implement bob and boi - madhu  
		}
		
	}

	private static void createBankAccount(Scanner sc, int bank) {
		
		Account ac = new Account();
		ac.setId(UUID.randomUUID().toString());
		System.out.println("Please enter account holder name");
		sc.nextLine();
		String name = sc.nextLine();
		ac.setAccountName(name);
		ac.setAccountOpeningDate(new Date());
		ac.setBankName(bank==1?Account.indianBank:( bank==2?Account.boiBank:bank==3?Account.bobBank:Account.bobBank));
		String bankCode = bank==1? IndianBank.bankCode :( bank==2 ? "BOI"  : bank==3 ? "BOB":"BOB");
		ac.setAccountNumber(bankCode+ (int)(Math.random()*(1000-0+1)+0));
		System.out.println("please Enter your Address");
		ac.setAddress(sc.nextLine());
		ac.setBalance(100);
		ac.addTransaction(100);
		IndianBank.addAccount(ac);
		System.out.println("Account is Created");
		System.out.println("ur acc num is: "+ ac.getAccountNumber());
	}
}
