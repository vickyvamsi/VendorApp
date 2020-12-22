package com.app.validator;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.model.Customer;
import com.app.util.CoDecUtil;

public class CustomerValidator {

	@Autowired
	private CoDecUtil coDecUtil;
	
	public boolean isPwdAndTokenValid(String reqPwd,String reqToken,Customer cust){
		boolean flag=false;
		//1. read pwd,token from object
		String encPwd=cust.getPassword();
		
		String encToken=cust.getAccTock();
		//2. do decode
		String dbPwd=coDecUtil.doDecode(encPwd);
		String dbToken=coDecUtil.doDecode(encToken);
		//3. compare with reqPwd,reqToken
		if(reqPwd.equals(dbPwd) && reqToken.equals(dbToken)){
			flag=true;
		}
		return flag;
	}
	
	
	public boolean isCustTypeSeller(Customer cust){
		return cust.getCustType().equalsIgnoreCase("Seller");
	}
	
	public boolean isCustTypeConsumer(Customer cust){
		return cust.getCustType().equalsIgnoreCase("Consumer");
	}
	

}
