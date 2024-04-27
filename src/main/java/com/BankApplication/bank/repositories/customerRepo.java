package com.BankApplication.bank.repositories;


import com.BankApplication.bank.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface customerRepo extends JpaRepository<Customer ,Integer>
{
    public Customer getCustomerBycustid(Integer id);




}
