package com.bank;

interface Bank {
	
	boolean createAccount(String name, String address, String mobNum, String bankName);

	boolean closeAccount(String accountNumber);

	int checkUserBalance(String accountNumber);

	void depositeMoney(int moneyAmmount);

	int withdrawalAmmount(int ammount);
}