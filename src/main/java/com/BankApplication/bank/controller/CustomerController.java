package com.BankApplication.bank.controller;


import com.BankApplication.bank.entity.*;
import com.BankApplication.bank.services.serviceImplementation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer1")
public class CustomerController
{
    @Autowired
    customerServiceImple  customerimple;


    @Autowired
    accountServiceImple accountimple;


    @Autowired
    BankDetailsImple bankDetailsImple;


    @Autowired
    bankLocationImple  bankLocationImple;

    @Autowired
    transactionServiceImple transactionImple;



    @PostMapping("/addcust")
    public Customer addcust(@RequestBody Customer c)
    {
        return  customerimple.addcust(c);
    }

    //    responeseEntity ways
    @PostMapping("/addcust1")
    public ResponseEntity<Customer> addcust1(@RequestBody Customer c)
    {
        Customer addcust = customerimple.addcust(c);
        return ResponseEntity.status(HttpStatus.CREATED).body(addcust);
    }



    @PostMapping("/addaccount")
        public ResponseEntity<Account> addaccount(@RequestBody Account account)
    {
          Account ac=accountimple.addaccount(account);
          return ResponseEntity.status(HttpStatus.CREATED).body(ac);
    }



    @PostMapping("/addbankdetail")
    public ResponseEntity<BankDetails> addaccount(@RequestBody BankDetails bankDetails)
    {
        BankDetails addbankdetails = bankDetailsImple.addbankdetails(bankDetails);
        return ResponseEntity.status(HttpStatus.CREATED).body(addbankdetails);
    }


    @PostMapping("/addbankLocation")
    public ResponseEntity<BankLocation> addaccount(@RequestBody BankLocation bankLocation)
    {
        BankLocation addlocation = bankLocationImple.addlocation(bankLocation);
        return ResponseEntity.status(HttpStatus.CREATED).body(addlocation);
    }



    @GetMapping("/getcustomer/{custid}")
    public ResponseEntity<Customer> getcustomer(@PathVariable Integer custid)
    {
        Customer c = customerimple.getCustomerBycustid(custid);
        return  ResponseEntity.status(HttpStatus.ACCEPTED).body(c);
    }

    @GetMapping("/getaccount/{id}")
    public ResponseEntity<Account> getaccount(@PathVariable Integer id)
    {
        Account a = accountimple.getAccountById(id);
        return  ResponseEntity.status(HttpStatus.ACCEPTED).body(a);
    }



    @PostMapping("/transaction")
    public ResponseEntity<Transaction> addtransaction(@RequestBody  Transaction t)
    {
        Transaction transaction = transactionImple.addTransaction(t);
        return ResponseEntity.status(HttpStatus.CREATED).body(transaction);
    }


}
