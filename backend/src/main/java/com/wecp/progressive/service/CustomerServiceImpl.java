package com.wecp.progressive.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.wecp.progressive.dao.CustomerDAO;
import com.wecp.progressive.entity.Customers;

public class CustomerServiceImpl implements CustomerService{

    private static List<Customers> customers = new ArrayList<Customers>();
    private CustomerDAO customerDAO;

    public CustomerServiceImpl(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    @Override
    public List<Customers> getAllCustomers() throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllCustomers'");
    }

    @Override
    public Customers getCustomerById(int customerId) throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCustomerById'");
    }

    @Override
    public int addCustomer(Customers customers) throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addCustomer'");
    }

    @Override
    public void updateCustomer(Customers customers) throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateCustomer'");
    }

    @Override
    public void deleteCustomer(int customerId) throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteCustomer'");
    }

    @Override
    public List<Customers> getAllCustomersSortedByName() throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllCustomersSortedByName'");
    }

    @Override
    public List<Customers> getAllCustomersFromArrayList() {
        return customers;
    }

    @Override
    public List<Customers> addCustomersToArrayList(Customers customers) {
        CustomerServiceImpl.customers.add(customers);
        return CustomerServiceImpl.customers;
    }

    @Override
    public List<Customers> getAllCustomersSortedByNameFromArrayList() {
        Collections.sort(customers);
        return customers;
    }

    @Override
    public void emptyArrayList() {
        customers.clear();
    }

}