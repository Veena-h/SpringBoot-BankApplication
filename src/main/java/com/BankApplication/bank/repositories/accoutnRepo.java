package com.BankApplication.bank.repositories;

import com.BankApplication.bank.entity.Account;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface accoutnRepo extends JpaRepository<Account,Integer>
{
}
