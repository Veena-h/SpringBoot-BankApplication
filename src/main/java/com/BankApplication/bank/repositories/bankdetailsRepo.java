package com.BankApplication.bank.repositories;

import com.BankApplication.bank.entity.BankDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface bankdetailsRepo  extends JpaRepository<BankDetails,Integer>
{
}
