package com.accountinfo.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class TransactionDAO {
	private static Transactions list = new Transactions();

	static {
		list.getTransactionList().add(new Transaction(585309209, "SGSavings726", "08/11/2018", "SGD", null , 9540.98, "Credit", ""));
		list.getTransactionList().add(new Transaction(585309209, "SGSavings726", "08/11/2018", "SGD", null , 7497.82, "Credit", ""));
		list.getTransactionList().add(new Transaction(585309209, "SGSavings726", "08/11/2018", "SGD", null , 55564.79, "Credit", ""));
		list.getTransactionList().add(new Transaction(585309209, "SGSavings726", "08/11/2018", "SGD", null , 3311.55, "Credit", ""));
		list.getTransactionList().add(new Transaction(585309209, "SGSavings726", "08/11/2018", "SGD", null , 1905.86, "Credit", ""));
		list.getTransactionList().add(new Transaction(585309209, "SGSavings726", "08/11/2018", "SGD", null , 197.78, "Credit", ""));
		list.getTransactionList().add(new Transaction(585309209, "SGSavings726", "08/11/2018", "SGD", null , 8430.49, "Credit", ""));
		list.getTransactionList().add(new Transaction(585309209, "SGSavings726", "08/11/2018", "SGD", null , 8.33, "Credit", ""));
		
		list.getTransactionList().add(new Transaction(791066619, "AUSavings933", "08/11/2018", "AUD", null , 9540.98, "Credit", ""));
		list.getTransactionList().add(new Transaction(791066619, "AUSavings933", "08/11/2018", "AUD", null , 7497.82, "Credit", ""));
		list.getTransactionList().add(new Transaction(791066619, "AUSavings933", "08/11/2018", "AUD", null , 55564.79, "Credit", ""));
		list.getTransactionList().add(new Transaction(791066619, "AUSavings933", "08/11/2018", "AUD", null , 3311.55, "Credit", ""));
		list.getTransactionList().add(new Transaction(791066619, "AUSavings933", "08/11/2018", "AUD", null , 1905.86, "Credit", ""));
		list.getTransactionList().add(new Transaction(791066619, "AUSavings933", "08/11/2018", "AUD", null , 197.78, "Credit", ""));
		list.getTransactionList().add(new Transaction(791066619, "AUSavings933", "08/11/2018", "AUD", null , 8430.49, "Credit", ""));
		list.getTransactionList().add(new Transaction(791066619, "AUSavings933", "08/11/2018", "AUD", null , 8.33, "Credit", ""));
		
		list.getTransactionList().add(new Transaction(321143048, "AUCurrent433", "08/11/2018", "AUD", null , 9540.98, "Credit", ""));
		list.getTransactionList().add(new Transaction(321143048, "AUCurrent433", "08/11/2018", "AUD", null , 7497.82, "Credit", ""));
		list.getTransactionList().add(new Transaction(321143048, "AUCurrent433", "08/11/2018", "AUD", null , 55564.79, "Credit", ""));
		list.getTransactionList().add(new Transaction(321143048, "AUCurrent433", "08/11/2018", "AUD", null , 3311.55, "Credit", ""));
		list.getTransactionList().add(new Transaction(321143048, "AUCurrent433", "08/11/2018", "AUD", null , 1905.86, "Credit", ""));
		list.getTransactionList().add(new Transaction(321143048, "AUCurrent433", "08/11/2018", "AUD", null , 197.78, "Credit", ""));
		list.getTransactionList().add(new Transaction(321143048, "AUCurrent433", "08/11/2018", "AUD", null , 8430.49, "Credit", ""));
		list.getTransactionList().add(new Transaction(321143048, "AUCurrent433", "08/11/2018", "AUD", null , 8.33, "Credit", ""));

		
	}

	public Transactions getAllTransactions() {
		System.out.println("size: "+ list.getTransactionList().size());
		return list;
	}

	public List<Transaction> getAccTransactions(int acc) {
		
        List<Transaction> tList = new ArrayList<>();
		for (Transaction t : list.getTransactionList()) {
			if(t.getAccountNumber() == acc) {
				tList.add(t);
			}
		}
		System.out.println("getAccTransactions:size: "+ tList.size());
		return tList;
	}

	public void addTransaction(Transaction account) {
		list.getTransactionList().add(account);
	}
}