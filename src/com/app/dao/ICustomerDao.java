package com.app.dao;

import java.util.List;

import com.app.model.Customer;
import com.app.model.Item;

public interface ICustomerDao {

	public int saveCustomer(Customer cust);
	public void updateCustomer(Customer cust);
	public void deleteCustomer(int custId);
	public Customer getCustomerById(int custId);
	public List<Customer> getAllCustomer();
	public List<Object[]> getCustomerReport();
	
		public Customer getCustomerByEmailId(String emailId);
		public List<Item> getCustSellerItems(int custId);

}
