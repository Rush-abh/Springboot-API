package com.accountinfo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.accountinfo.model.AccountDAO;
import com.accountinfo.model.Accounts;



@RestController
@RequestMapping(path = "/accounts")
public class AccountController {
	@Autowired
	private AccountDAO accountDao;

	@GetMapping(path = "/", produces = "application/json")
	public Accounts getEmployees() {
		System.out.println("In request");
		return accountDao.getAllAccounts();
	}

}
