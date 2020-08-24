  
package com.project.banking.service;

import com.project.banking.dao.AccountDao;
import com.project.banking.dao.AccountDaoImpl;
import com.project.banking.model.Account;
import com.project.banking.service.AccountService;

public class AccountServiceImpl implements AccountService {

	AccountService ad = new AccountService();

	@Override
	public int openAccount(Account account) {
		return ad.openAccount(account);
	}
	
	public int depositAccount(Account account) {
		return ad.depositAccount(account);
	}
	
	public int withdrawAccount(Account account) {
		return ad.withdrawAccount(account);
	}

}