package com.BankApplication.bank.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

@Data

@Entity
public class Transaction
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int transactionId;

    private float transactionAmount;

    private String transaction_status;

    private String transactiondate;

    private String transactionTime;

    @ManyToOne
    @JsonBackReference
    private Account account;




    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }




    public String getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(String transactionTime) {
        this.transactionTime = transactionTime;
    }

    public String getTransactiondate() {
        return transactiondate;
    }

    public void setTransactiondate(String transactiondate) {
        this.transactiondate = transactiondate;
    }

    public String getTransaction_status() {
        return transaction_status;
    }

    public void setTransaction_status(String transaction_status) {
        this.transaction_status = transaction_status;
    }

    public float getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(float transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }
}
