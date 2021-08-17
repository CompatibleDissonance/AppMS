package com.Cian.AppMS.model;

import com.sun.istack.NotNull;


import java.util.Date;

public class CardPaymentForm {
    @NotNull
    private long cardNumber;
    @NotNull
    private String cardName;
    @NotNull
    private Date expDate;
    @NotNull
    private double securityCode;

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }

    public double getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(double securityCode) {
        this.securityCode = securityCode;
    }

    @Override
    public String toString() {
        return "CardPaymentForm{" +
                "cardNumber=" + cardNumber +
                ", cardName='" + cardName + '\'' +
                ", expDate=" + expDate +
                ", securityCode=" + securityCode +
                '}';
    }
}
