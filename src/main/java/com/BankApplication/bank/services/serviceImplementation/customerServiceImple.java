package com.BankApplication.bank.services.serviceImplementation;


import com.BankApplication.bank.entity.Customer;
import com.BankApplication.bank.repositories.customerRepo;
import com.BankApplication.bank.services.customerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class customerServiceImple implements customerService
{
    @Autowired
    customerRepo customer;



    @Override
    public Customer addcust(Customer c) {

        return customer.save(c);
    }

    @Override
    public Customer getCustomerBycustid(Integer id) {
        return customer.getCustomerBycustid(id);
    }

    @Override
    public List<Customer> getAllCustomer() {
        return customer.getAllCustomer();
    }
}
