package com.lph.app.core.dao;

import java.util.List;

import com.lph.app.core.entity.Customer;

public interface CustomerDAO {
    public void insert(Customer customer);

    public Customer findByCustomerId(int custId);

    List<Customer> findAll();

    Boolean batchUpdate(final List<Customer> customers);

    void addCustomer();

    String addCustomerReturnValue();

    void addCustomerThrowException() throws Exception;

    void addCustomerAround(String name);
}
