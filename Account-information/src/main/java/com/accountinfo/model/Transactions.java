package com.accountinfo.model;

import java.util.ArrayList;
import java.util.List;
 
public class Transactions 
{
    private List<Transaction> transactionList;
     
    public List<Transaction> getTransactionList() {
        if(transactionList == null) {
            transactionList = new ArrayList<>();
        }
        return transactionList;
    }
    
  
    public void setAccountList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }
}