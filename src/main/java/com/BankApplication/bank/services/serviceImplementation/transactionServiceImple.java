package com.BankApplication.bank.services.serviceImplementation;

import com.BankApplication.bank.entity.Transaction;
import com.BankApplication.bank.repositories.transactionRepo;
import com.BankApplication.bank.services.transactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class transactionServiceImple implements transactionService
{

    @Autowired
    transactionRepo transaction;

    @Override
    public Transaction addTransaction(Transaction t) {
        return transaction.save(t);
    }
}
