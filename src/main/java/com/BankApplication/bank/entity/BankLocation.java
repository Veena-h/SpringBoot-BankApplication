package com.BankApplication.bank.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class BankLocation
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bankLocation_id;


    private String city;

    private String state;

    private String country;


    @OneToOne
    @JsonBackReference
   private BankDetails bankDetails;






    public int getBankLocation_id() {
        return bankLocation_id;
    }

    public void setBankLocation_id(int bankLocation_id) {
        this.bankLocation_id = bankLocation_id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }




}
