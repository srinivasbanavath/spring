package com.customer.jdbc;

import java.util.Date;

public class Customer {

	private int id;
	private String status;
	private Date customerSince;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getCustomerSince() {
		return customerSince;
	}
	public void setCustomerSince(Date customerSince) {
		this.customerSince = customerSince;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", status=" + status + ", customerSince=" + customerSince + "]";
	}
	public Customer(int id, String status, Date customerSince) {
		super();
		this.id = id;
		this.status = status;
		this.customerSince = customerSince;
	}
	public Customer() {
	}
	
	
}
