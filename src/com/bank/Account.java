package com.bank;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Account{
    public static final String indianBank = "INDIAN_BANK";
    public static final String boiBank = "BANK_OF_INDIA_BANK";
    public static final String bobBank = "BANK_OF_BARODA_BANK";
    
	private String id;
    private String accountNumber;
    private String accountName;
    private String address;
    private int balance;
    private List<Integer> transactions;
    private Date accountOpeningDate;
    private String bankName;
    
    
    public Account() {
		super();
		// TODO Auto-generated constructor stub
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


	public List<Integer> getTransactions() {
		return transactions;
	}


	public void setTransactions(List<Integer> transactions) {
		this.transactions = transactions;
	}


	public Date getAccountOpeningDate() {
		return accountOpeningDate;
	}


	public void setAccountOpeningDate(Date accountOpeningDate) {
		this.accountOpeningDate = accountOpeningDate;
	}


	public String getBankName() {
		return bankName;
	}


	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public void addTransaction(int amt) {
		if(transactions==null) {
			transactions = new ArrayList<Integer>();
		}
		this.transactions.add(amt);
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", accountNumber=" + accountNumber + ", accountName=" + accountName + ", address="
				+ address + ", balance=" + balance + ", accountOpeningDate=" + accountOpeningDate + ", bankName="
				+ bankName + "]";
	}
    
    

    

}