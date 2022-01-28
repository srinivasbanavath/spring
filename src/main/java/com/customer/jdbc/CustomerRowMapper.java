package com.customer.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CustomerRowMapper implements RowMapper<Customer> {
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException
	{
		Customer customer = new Customer();
		customer.setId(rs.getInt("id"));
		customer.setStatus(rs.getString("status"));
		customer.setCustomerSince(rs.getDate("customerSince"));
		return customer;
	}
}
