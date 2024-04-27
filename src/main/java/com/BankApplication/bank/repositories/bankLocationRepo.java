package com.BankApplication.bank.repositories;

import com.BankApplication.bank.entity.BankLocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface bankLocationRepo extends JpaRepository<BankLocation,Integer>
{
}
