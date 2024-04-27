package com.BankApplication.bank.services;

import com.BankApplication.bank.entity.Customer;

import java.util.List;

public interface customerService
{
    public Customer addcust(Customer c);

    public Customer getCustomerBycustid(Integer id);

    public List<Customer> getAllCustomer();


}
