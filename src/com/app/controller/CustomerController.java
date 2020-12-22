package com.app.controller;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.model.Customer;
import com.app.model.Item;
import com.app.service.impl.CustomerServiceImpl;
import com.app.util.CoDecUtil;
import com.app.util.CodeUtil;
import com.app.util.CommonUtil;
import com.app.util.CustomerUtil;
import com.app.util.addUiComponentUtil;

@Controller
public class CustomerController {

	@Autowired
	private CustomerServiceImpl service;
	@Autowired
	private CustomerUtil util;
	@Autowired
	private ServletContext context;
	//Add Ui Components 
	@Autowired
	private addUiComponentUtil UiUtil;
	
	// Generate Password and Tocken
	@Autowired
	private CodeUtil CodeUtil;
	
	// String Convert readable formate to unReadable Formate
	@Autowired
	private CoDecUtil CoDecUtil;
	
	@Autowired
	private CommonUtil commonUtil;
	
		@RequestMapping("/regCust")
		public String showCustomer(){
			return "CustomerReg";
		}
	//Register Customer Details
		@RequestMapping(value="/custReg",method=RequestMethod.POST)
		public String saveCust(@ModelAttribute("customer")Customer cust,ModelMap map){
			//1. generate Password and Token
			String tkn=CodeUtil.genTocken();
			String pwd=CodeUtil.genPwd();
			
			System.out.println("PWD:"+pwd+",TKN:"+tkn);
			//2. encode details
			String encTkn=CoDecUtil.doEncode(tkn);
			String encPwd=CoDecUtil.doEncode(pwd);
			
			//3. set encoded details to cust object
			
			cust.setAccTock(encTkn);
			
			cust.setPassword(encPwd);
			
			//4. save customer
			
			int custId=service.saveCustomer(cust);
		
			//5. send email
			String text="Welcome to Customer "+cust.getCustName()+" ,your Id is :"+cust.getCustEmail()
					+", type is: "+cust.getCustType()
					+", password is :"+pwd+" , token is:"+tkn;
			boolean issent=commonUtil.sendEmail(cust.getCustEmail(), "Welcome to Customer", text);
			
			//6. message to UI
			
			String message="Customer Registred with Id:"+custId;
			if(issent){
				service.saveCustomer(cust);
				message+=",email also sent..";
			}
			else 
				
				message+=",email is not sent!!";
			 
			map.addAttribute("message", message);
			return "CustomerReg";
		}
		
		// show All Customer Data
		@RequestMapping("/CustomerData")
		public String ShowCustomerData(ModelMap map){
			List<Customer> cust=service.getAllCustomer();
			map.addAttribute("Customers", cust);
			return "CustomerData";
		}
		// Retrive All Customer Data from DB
		@RequestMapping("/deleteCust")
		public String getCustmoerData(@RequestParam("custId")int custId){
			service.deleteCustomer(custId);
			return "redirect:CustomerData";
		}
		
		// Edit Custmore Data
		@RequestMapping("/updateCust")
		public String updateData(@RequestParam("custId")int custId,ModelMap map){
			Customer custs=service.getCustomerById(custId);
			map.addAttribute("cust", custs);
			UiUtil.addComponent(map);
			return "EditCustomerData";
		}
		// update customer data
		@RequestMapping(value="/updatecustReg",method=RequestMethod.POST)
		public String updatecustData(@ModelAttribute("customer")Customer cust){
				service.updateCustomer(cust);
			return "redirect:CustomerData";
		}
		
		//Export Excel Data 
		@RequestMapping("/excelViewData")
		public String excelViewData(ModelMap map){
			List<Customer>custs=service.getAllCustomer();
			map.addAttribute("custs",custs);
			return "custexcelViewData";
		}
		
		//Export Pdf Data
		@RequestMapping("/custPdf")
		public String pdfDataView(ModelMap map){
			List<Customer> custs=service.getAllCustomer();
			map.addAttribute("cust",custs);
			return "custPdfViewData";
		}
		
		//Customer Report 
		@RequestMapping("/CustReport")
		public String CustReport(){
			List<Object[]> list=service.getCustomerReport();
			String path=context.getRealPath("/");
			util.generatorBarDataset(path, list);
			util.generatorPieDataset(path, list);
			return "CustReportView";
		}
		//4. show Customer Seller Items
		@RequestMapping("/viewCustItems")
		public String showItems(@RequestParam("custId")int custId,ModelMap map){
			List<Item> items=service.getCustSellerItems(custId);
			map.addAttribute("custItems",items);
			return "CustomerItems";
		}
}

