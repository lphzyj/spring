package com.lph.app.core.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.lph.app.core.common.CustomerRowMapper;
import com.lph.app.core.dao.CustomerDAO;
import com.lph.app.core.entity.Customer;

public class JdbcCustomerDAO implements CustomerDAO {
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
	this.dataSource = dataSource;
    }

    public void insert(Customer customer) {

	String sql = "INSERT INTO CUSTOMER " + "(CUST_ID, NAME, AGE) VALUES (?, ?, ?)";
	Connection conn = null;

	try {
	    conn = dataSource.getConnection();
	    PreparedStatement ps = conn.prepareStatement(sql);
	    ps.setInt(1, customer.getCustId());
	    ps.setString(2, customer.getName());
	    ps.setInt(3, customer.getAge());
	    ps.executeUpdate();
	    ps.close();

	} catch (SQLException e) {
	    throw new RuntimeException(e);

	} finally {
	    if (conn != null) {
		try {
		    conn.close();
		} catch (SQLException e) {
		}
	    }
	}
    }

    public Customer findByCustomerId(int custId) {

	String sql = "SELECT * FROM CUSTOMER WHERE CUST_ID = ?";
	try {
	    @SuppressWarnings("unchecked")
	    Customer customer = (Customer) getJdbcTemplate().queryForObject(sql, new Object[] { custId },
		    new CustomerRowMapper());
	    return customer;
	} finally {

	}
    }

    private JdbcTemplate getJdbcTemplate() {
	return new JdbcTemplate(dataSource);
    }

    @SuppressWarnings("unused")
    @Override
    public List<Customer> findAll() {
	String sql = "select * from customer";
	List<Customer> customers = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(Customer.class));
	return customers;
    }

    @Override
    public Boolean batchUpdate(final List<Customer> customers) {
	String sql = "insert into customer(name,age) values(?,?)";
	getJdbcTemplate().batchUpdate(sql, new BatchPreparedStatementSetter() {

	    @Override
	    public void setValues(PreparedStatement ps, int i) throws SQLException {
		Customer customer = customers.get(i);
		ps.setString(1, customer.getName());
		ps.setInt(2, customer.getAge());
	    }

	    @Override
	    public int getBatchSize() {
		// TODO Auto-generated method stub
		return customers.size();
	    }
	});
	return Boolean.TRUE;
    }

    @Override
    public void addCustomer() {
	System.out.println("addCustomer() is running ");
    }

    @Override
    public String addCustomerReturnValue() {
	System.out.println("addCustomerReturnValue() is running ");
	return "abc";
    }

    @Override
    public void addCustomerThrowException() throws Exception {
	System.out.println("addCustomerThrowException() is running ");
	throw new Exception("Generic Error");
    }

    @Override
    public void addCustomerAround(String name) {
	System.out.println("addCustomerAround() is running, args : " + name);
    }
}