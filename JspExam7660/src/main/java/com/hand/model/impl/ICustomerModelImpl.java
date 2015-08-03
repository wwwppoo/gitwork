package com.hand.model.impl;

import java.util.List;

import com.hand.dao.ICustomerDao;
import com.hand.dao.impl.ICustomerDaoImpl;
import com.hand.model.ICustomerModel;
import com.hand.vo.Customer;

public class ICustomerModelImpl implements ICustomerModel {
	ICustomerDao icustomerDao = new ICustomerDaoImpl();

	
	public boolean matchUsername(String username) {
		List<Customer> list = icustomerDao.matchUsername(username);
		if(list.size()>0){
			return true;
		}else{
			return false;
		}
		
	}

}
