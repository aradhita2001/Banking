package com.wecp.progressive.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.wecp.progressive.dto.CustomerAccountInfo;
import com.wecp.progressive.entity.Accounts;
import com.wecp.progressive.entity.Customers;

public class CustomerDAOImpl implements CustomerDAO {

    private static List<Customers> customerList = new ArrayList<Customers>();

    public CustomerDAOImpl() {
        // customerList = new ArrayList<Customers>();
    }

    @Override
    public int addCustomer(Customers customers) {
        // customers.setCustomerId(customerList.size()+1);
        customerList.add(customers);
        return 0;//customerList.size();
    }

    @Override
    public Customers getCustomerById(int customerId) {
        for(Customers customer : customerList){
            if(customer.getCustomerId() == customerId) return customer;
        }

        return null;
    }

    @Override
    public void updateCustomer(Customers customers) {
        for(Customers customerIterator : customerList){
            if(customerIterator.getCustomerId() == customers.getCustomerId()) {
                customerIterator.setEmail(customers.getEmail());
                customerIterator.setName(customers.getName());
                customerIterator.setPassword(customers.getPassword());
                customerIterator.setRole(customers.getRole());
                customerIterator.setUsername(customers.getUsername());
            }
        }
    }

    @Override
    public void deleteCustomer(int customerId) {
        for(Customers customer : customerList){
            if(customer.getCustomerId() == customerId) customerList.remove(customer);
        }
    }

    @Override
    public List<Customers> getAllCustomers() {
        Collections.sort(customerList);
        return customerList;
    }

    @Override
    public CustomerAccountInfo getCustomerAccountInfo(int customerId) {

        Customers customers = null;
        for(Customers customer : customerList){
            if(customer.getCustomerId() == customerId) customers = customer;
        }

        AccountDAOImpl accountDAOImpl = new AccountDAOImpl();
        // accountDAOImpl.getAccountById()

        return null;

        
    }

}
