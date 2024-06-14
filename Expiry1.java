package com.example.demo8;

public class Expiry1 {
    private String medicine_name,side_,menudetails,expiry,dose_,benifits;

    public Expiry1(String medicine_name, String side_, String menudetails, String expiry, String dose_, String benifits) {
        this.medicine_name = medicine_name;
        this.side_ = side_;
        this.menudetails = menudetails;
        this.expiry = expiry;
        this.dose_ = dose_;
        this.benifits = benifits;
    }

    public String getMedicine_name() {
        return medicine_name;
    }

    public String getSide_() {
        return side_;
    }

    public String getMenudetails() {
        return menudetails;
    }

    public String getExpiry() {
        return expiry;
    }

    public String getDose_() {
        return dose_;
    }

    public String getBenifits() {
        return benifits;
    }
}
