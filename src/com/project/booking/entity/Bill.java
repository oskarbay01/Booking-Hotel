package com.project.booking.entity;


public class Bill {
    private Integer amount;

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Bill(Integer amount) {
        this.amount = amount;
    }
}
