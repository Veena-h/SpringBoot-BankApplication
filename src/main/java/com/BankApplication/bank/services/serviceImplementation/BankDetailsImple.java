package com.BankApplication.bank.services.serviceImplementation;


import com.BankApplication.bank.entity.BankDetails;
import com.BankApplication.bank.repositories.bankdetailsRepo;
import com.BankApplication.bank.services.bankDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankDetailsImple implements bankDetailsService
{
    @Autowired
    bankdetailsRepo bankdetail;

    @Override
    public BankDetails addbankdetails(BankDetails bankDetails) {
        return bankdetail.save(bankDetails);
    }
}
