package com.wecp.progressive.dto;

public class CustomerAccountInfo {

    private int customerId;
    private String customerName;
    private String email;
    private int accountId;
    private double balance;
    
    public CustomerAccountInfo(int customerId, String customerName, String email, int accountId, double balance) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.email = email;
        this.accountId = accountId;
        this.balance = balance;
    }

    
}
