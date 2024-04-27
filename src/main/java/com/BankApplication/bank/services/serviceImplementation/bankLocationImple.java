package com.BankApplication.bank.services.serviceImplementation;

import com.BankApplication.bank.entity.BankLocation;
import com.BankApplication.bank.repositories.bankLocationRepo;
import com.BankApplication.bank.services.bankLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class bankLocationImple implements bankLocationService
{

    @Autowired
    bankLocationRepo banklocations;

    @Override
    public BankLocation addlocation(BankLocation bankLocation) {
        return banklocations.save(bankLocation);
    }
}
