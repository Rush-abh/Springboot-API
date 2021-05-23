package com.accountinfo.model;

public class Account {

	private int accountNumber;
	private String accountName;
	private String accountType;
	private String balanceDate;		//can be Date, but for simplicity
	private String currencyType;
	private Double openingBalance;

	// empty constructor
	public Account() {
	}

	// constructor

	public Account(int accountNumber, String accountName,String accountType, String balanceDate, String currencyType, Double openingBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.accountType = accountType;
		this.balanceDate = balanceDate;
		this.currencyType = currencyType;
		this.openingBalance = openingBalance;
		
	}

	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(int i) {
		this.accountNumber = i;
	}
	
	public String getAccountName() {
		return accountName;
	}
	
	public void setAccontName(String i) {
		this.accountName = i;
	}
	
	public String getAccountType() {
		return accountType;
	}
	
	public void setAccontType(String i) {
		this.accountType = i;
	}
	
	public String getBalanceDate() {
		return balanceDate;
	}
	
	public void setBalanceDate(String i) {
		this.balanceDate = i;
	}
	
	public String getCurrencyType() {
		return currencyType;
	}
	
	public void setCurrencyType(String i) {
		this.currencyType = i;
	}
	
	public Double getOpeningBalance() {
		return openingBalance;
	}
	
	public void setOpeningBalance(Double i) {
		this.openingBalance = i;
	}
	
	
	
	@Override
	public String toString() {
		return accountName;
	}
}
