package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.ICustomerDao;
import com.app.model.Customer;
import com.app.model.Item;
@Repository
public class CustomerDaoImpl implements ICustomerDao {
	@Autowired
	private HibernateTemplate ht;
	
	@Override
	public int saveCustomer(Customer cust) {
		int custId=(Integer)ht.save(cust);
		return custId;
	}

	@Override
	public void updateCustomer(Customer cust) {
		ht.update(cust);
	}

	@Override
	public void deleteCustomer(int custId) {
			Customer cust=new Customer();
			cust.setCustId(custId);
			ht.delete(cust);
	}

	@Override
	public Customer getCustomerById(int custId) {
			Customer cust=ht.get(Customer.class, custId);
		return cust;
	}

	@Override
	public List<Customer> getAllCustomer() {
			List<Customer> list=ht.loadAll(Customer.class);
		return list;
	}
	@Override
	public List<Object[]> getCustomerReport() {
		String Hql="select custType,count(custType) from com.app.model.Customer group by custType";
		
			List<Object[]> list=ht.find(Hql);
		return list;
	}
	//--------------------------------------------------------------

	//@Override
	public Customer getCustomerByEmailId(String emailId) {
		Customer cust=null;
		String hql="from "+Customer.class.getName()
				+" where custEmail=?";
		@SuppressWarnings("unchecked")
		List<Customer> list=ht.find(hql, emailId);
		if(list!=null && list.size()>0){
			cust=list.get(0);
		}
		return cust;
	}

	//@Override
	public List<Item> getCustSellerItems(int custId) {
		String hql="from "+Item.class.getName()
				+" where custId=?";
		@SuppressWarnings("unchecked")
		List<Item> items=ht.find(hql, custId);
		return items;
	}
	


}
