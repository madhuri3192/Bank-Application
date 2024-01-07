package com.bank;
import java.util.Date;

class Account{
    public static final String indianBank = "INDIAN_BANK";
    public static final String boiBank = "BANK_OF_INDIA_BANK";
    public static final String bobBank = "BANK_OF_BARODA_BANK";
    
	private String id;
    private String accountNumber;
    private String accountName;
    private String address;
    private int balance;
    private int[] transactions;
    private Date accountOpeningDate;
    
    
    public Account() {
		super();
		// TODO Auto-generated constructor stub
    }
    
	public Account(String id, String accountNumber, String accountName, String address, int balance, int[] transactions,
			Date accountOpeningDate) {
		super();
		this.id = id;
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.address = address;
		this.balance = balance;
		this.transactions = transactions;
		this.accountOpeningDate = accountOpeningDate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int[] getTransactions() {
		return transactions;
	}
	public void setTransactions(int[] transactions) {
		this.transactions = transactions;
	}
	public Date getAccountOpeningDate() {
		return accountOpeningDate;
	}
	public void setAccountOpeningDate(Date accountOpeningDate) {
		this.accountOpeningDate = accountOpeningDate;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", accountNumber=" + accountNumber + ", accountName=" + accountName + ", address="
				+ address + ", balance=" + balance + ", accountOpeningDate=" + accountOpeningDate + "]";
	}

	

    

}