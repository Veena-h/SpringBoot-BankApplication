package com.BankApplication.bank.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Account
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true)
    private long accountno;

    @Column
    private float amountbalance;


    @OneToOne
    @JsonBackReference
    private Customer customer;

    @OneToOne
    @JsonBackReference
    private BankDetails bankDetails;

    @OneToMany(mappedBy = "account")
    @JsonManagedReference
    private  List<Transaction> transactions;



//    getter setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getAccountno() {
        return accountno;
    }

    public void setAccountno(long accountno) {
        this.accountno = accountno;
    }

    public float getAmountbalance() {
        return amountbalance;
    }

    public void setAmountbalance(float amountbalance) {
        this.amountbalance = amountbalance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public BankDetails getBankDetails() {
        return bankDetails;
    }

    public void setBankDetails(BankDetails bankDetails) {
        this.bankDetails = bankDetails;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
}
