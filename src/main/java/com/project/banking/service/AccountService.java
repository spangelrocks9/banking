package com.project.banking.service;

import com.project.banking.model.Account;

public interface AccountService {

	int openAccount(AccountService account);
	
	int depositAccount(AccountService account);
	
	int WithdrawAccount(AccountService account);

}