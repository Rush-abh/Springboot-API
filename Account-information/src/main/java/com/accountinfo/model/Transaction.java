package com.accountinfo.model;


public class Transaction {

	private int accountNumber;
	private String accountName;
	private String valueDate;//can be Date, but for simplicity
	private String currencyType;
	private Double debitAmount;
	private Double creditAmount;
	private String transType;
	private String transNarrative;

	// empty constructor
	public Transaction() {
	}

	// constructor
//	public Account(int accountNumber, String accountName, String accountType, String balanceDate, String currencyType, Double openingBalance) {

	public Transaction(int accountNumber, String accountName, String valueDate, String currencyType, Double debitAmount , Double creditAmount, 
			String transType, String transNarrative) {
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.valueDate = valueDate;
		this.currencyType = currencyType;
		this.debitAmount = debitAmount;
		this.creditAmount = creditAmount;
		this.transType = transType;
		this.transNarrative = transNarrative;
		
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
	
	public String getvalueDate() {
		return valueDate;
	}
	
	public void setValueDate(String i) {
		this.valueDate = i;
	}
	
	public String getCurrencyType() {
		return currencyType;
	}
	
	public void setCurrencyType(String i) {
		this.currencyType = i;
	}
	
	public Double getDebitAmount() {
		return debitAmount;
	}
	
	public void setDebitAmount(Double i) {
		this.debitAmount = i;
	}
	
	public Double getCreditAmount() {
		return creditAmount;
	}
	
	public void setCreditAmount(Double i) {
		this.creditAmount = i;
	}
	
	public String getTransType() {
		return transType;
	}
	
	public void setTransType(String i) {
		this.transType = i;
	}
	
	public String getTransNarrative() {
		return transNarrative;
	}
	
	public void setTransNarrative(String i) {
		this.transNarrative = i;
	}
	
	@Override
	public String toString() {
		return accountName;
	}
}
