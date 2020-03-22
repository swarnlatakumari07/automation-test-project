package org.automation.test.model;

import io.cucumber.datatable.dependency.com.fasterxml.jackson.annotation.JsonProperty;

public class CardDetails {
    @JsonProperty("card_number")
    private String cardNumber;
    @JsonProperty("expiry_date")
    private String expiryDate;
    @JsonProperty("cvv")
    private String cvv;
    @JsonProperty("otp")
    private String otp;

    public String getCardNumber() {
        return cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public String getCvv() {
        return cvv;
    }

    public String getOtp() {
        return otp;
    }
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }
}
