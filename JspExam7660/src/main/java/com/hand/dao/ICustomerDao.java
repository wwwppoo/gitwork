package com.hand.dao;

import java.util.List;

import com.hand.vo.Customer;

public interface ICustomerDao {
	
	List<Customer> matchUsername(String username);

}
