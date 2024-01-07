package com.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IndianBank implements Bank {
	public static final String bankCode = "INDB";
	private static List<Account> accountList;
	private static Map<String, Account> accountMap = new HashMap<String, Account>();
	
	
	
	public static Account getAccount(String accountNumber) {
		return accountMap.get(accountNumber);
	}


	static {
		accountList = new ArrayList<Account>();
	}
	
	
	
	public static List<Account> getAccountList() {
		return accountList;
	}

	public static void addAccount(Account account) {
		IndianBank.accountList.add(account);
		accountMap.put(account.getAccountNumber(), account);
	}


	@Override
	public boolean createAccount(String name, String address, String mobNum, String bankName) {
//		Account 
		return false;
	}

	@Override
	public boolean closeAccount(String accountNumber) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int checkUserBalance(String accountNumber) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void depositeMoney(int moneyAmmount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int withdrawalAmmount(int ammount) {
		// TODO Auto-generated method stub
		return 0;
	}

}
