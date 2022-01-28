package com.customer.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class CustomerRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Transactional(readOnly = true)
	public Customer findById(int id){
		String sql = "SELECT * FROM customers WHERE id = ?";
		Customer customer = jdbcTemplate.queryForObject(sql, new CustomerRowMapper(), new Object[] { id });
		return customer;
	}
	
}
