package com.BankApplication.bank.services.serviceImplementation;


import com.BankApplication.bank.entity.Account;
import com.BankApplication.bank.repositories.accoutnRepo;
import com.BankApplication.bank.services.accountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class accountServiceImple implements accountService
{
    @Autowired
    accoutnRepo ac;

    @Override
    public Account addaccount(Account account) {
        return ac.save(account);
    }

    @Override
    public Account getAccountById(Integer id) {
        return ac.getAccountById(id);
    }
}
