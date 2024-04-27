package com.BankApplication.bank.services;

import com.BankApplication.bank.entity.Account;

public interface accountService
{
    public Account addaccount(Account account);

    public Account getAccountById(Integer id);
}
