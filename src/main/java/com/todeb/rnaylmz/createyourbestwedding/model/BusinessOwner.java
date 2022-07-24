package com.todeb.rnaylmz.createyourbestwedding.model;

public class BusinessOwner extends User{
    private String address;
    private int IBAN;
    private int priceForJob;



    public int getIBAN() {
        return IBAN;
    }

    public void setIBAN(int IBAN) {
        this.IBAN = IBAN;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPriceForJob() {
        return priceForJob;
    }

    public void setPriceForJob(int priceForJob) {
        this.priceForJob = priceForJob;
    }
}
