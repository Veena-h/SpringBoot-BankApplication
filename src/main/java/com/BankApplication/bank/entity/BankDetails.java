package com.BankApplication.bank.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class BankDetails
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int branch_id;

    private String branch_name;

    private String bank_ifsc;


    @OneToOne(mappedBy = "bankDetails")
    @JsonBackReference
    Account account;

    @OneToOne(mappedBy = "bankDetails")
    @JsonManagedReference
    BankLocation bankLocation;





    public int getBranch_id() {
        return branch_id;
    }

    public void setBranch_id(int branch_id) {
        this.branch_id = branch_id;
    }

    public String getBranch_name() {
        return branch_name;
    }

    public void setBranch_name(String branch_name) {
        this.branch_name = branch_name;
    }

    public String getBank_ifsc() {
        return bank_ifsc;
    }

    public void setBank_ifsc(String bank_ifsc) {
        this.bank_ifsc = bank_ifsc;
    }
}
