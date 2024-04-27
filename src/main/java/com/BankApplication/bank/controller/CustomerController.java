package com.BankApplication.bank.controller;


import com.BankApplication.bank.entity.Account;
import com.BankApplication.bank.entity.BankDetails;
import com.BankApplication.bank.entity.BankLocation;
import com.BankApplication.bank.entity.Customer;
import com.BankApplication.bank.services.serviceImplementation.BankDetailsImple;
import com.BankApplication.bank.services.serviceImplementation.accountServiceImple;
import com.BankApplication.bank.services.serviceImplementation.bankLocationImple;
import com.BankApplication.bank.services.serviceImplementation.customerServiceImple;
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


    @GetMapping("/getallcustomer")
    public ResponseEntity<List<Customer>> getallcustomer()
    {
        List<Customer> c = customerimple.getAllCustomer();
        return  ResponseEntity.status(HttpStatus.ACCEPTED).body(c);
    }

}
