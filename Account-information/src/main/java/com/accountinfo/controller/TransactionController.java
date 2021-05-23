package com.accountinfo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.accountinfo.model.Transaction;
import com.accountinfo.model.TransactionDAO;
import com.accountinfo.model.Transactions;

@RestController
@RequestMapping(path = "/transaction")
public class TransactionController {
	@Autowired
	private TransactionDAO transDao;

	@GetMapping(path = "/", produces = "application/json")
	public Transactions getTransaction() {
		System.out.println("In request");
		return transDao.getAllTransactions();
	}

	@GetMapping(path = "/acc", produces = "application/json")
	public List<Transaction> getTransaction(@RequestParam(value = "no", defaultValue = "585309209") String acc) {
		System.out.println("In request");
		return transDao.getAccTransactions(Integer.parseInt(acc));
	}

}
