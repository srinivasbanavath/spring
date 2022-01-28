package com.customer.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerJdbcApplication implements CommandLineRunner {

	@Autowired
	private CustomerRepository customerRepository;
	public static void main(String[] args) {
		SpringApplication.run(CustomerJdbcApplication.class, args);
	}
	public void run(String... args) throws Exception {
		System.out.println("running");
		Customer customer = customerRepository.findById(2);
		System.out.println(customer);
	}

}
