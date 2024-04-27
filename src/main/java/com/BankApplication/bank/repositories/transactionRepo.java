package com.BankApplication.bank.repositories;

import com.BankApplication.bank.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface transactionRepo extends JpaRepository<Transaction,Integer>
{
}
