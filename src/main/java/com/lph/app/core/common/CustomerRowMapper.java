package com.lph.app.core.common;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.lph.app.core.entity.Customer;

public class CustomerRowMapper implements RowMapper<Object> {
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
	Customer customer = new Customer();
	customer.setCustId(rs.getInt("CUST_ID"));
	customer.setName(rs.getString("NAME"));
	customer.setAge(rs.getInt("AGE"));
	return customer;
    }

}