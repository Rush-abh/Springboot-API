package com.accountinfo.model;

import org.springframework.stereotype.Repository;

@Repository
public class AccountDAO {
	private static Accounts list = new Accounts();

	static {
		list.getAccountList().add(new Account(585309209, "SGSavings726", "Savings", "08/11/2018", "SGD", 84327.51));
		list.getAccountList().add(new Account(791066619, "AUSavings933", "Savings", "08/11/2018", "AUD", 88005.93));
		list.getAccountList().add(new Account(321143048, "AUCurrent433", "Current", "08/11/2018", "AUD", 38010.62));
		list.getAccountList().add(new Account(347786244, "SGCurrent116", "Current", "08/11/2018", "SGD", 50664.65));
		list.getAccountList().add(new Account(680168913, "AUCurrent374", "Current", "08/11/2018", "AUD", 41327.28));
		list.getAccountList().add(new Account(136056165, "AUSavings938", "Savings", "08/11/2018", "AUD", 48928.79));
		list.getAccountList().add(new Account(453963528, "SGSavings842", "Savings", "08/11/2018", "SGD", 72117.53));
		list.getAccountList().add(new Account(334666982, "AUSavings253", "Savings", "08/11/2018", "AUD", 20588.16));
		list.getAccountList().add(new Account(793949180, "AUCurrent754", "Current", "08/11/2018", "AUD", 88794.48));
		list.getAccountList().add(new Account(768759901, "SGCurrent294", "Current", "08/11/2018", "SGD", 5906.55));
		list.getAccountList().add(new Account(847257972, "AUCurrent591", "Current", "08/11/2018", "AUD", 92561.68));
	}

	public Accounts getAllAccounts() {
		System.out.println("size: "+ list.getAccountList().size());
		return list;
	}

	public void addAccount(Account account) {
		list.getAccountList().add(account);
	}
}