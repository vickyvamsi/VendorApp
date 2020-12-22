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

import com.app.model.Vendor;
import com.app.service.IVendorService;
import com.app.util.VendorUtil;
import com.app.util.addUiComponentUtil;

@Controller
public class VendorController {

	@Autowired
	private IVendorService service;
	@Autowired
	private addUiComponentUtil Uiutil;
	@Autowired
	private VendorUtil util; // chats report generators
	@Autowired
	private ServletContext context;
	
	@RequestMapping("/regVen")
	public String showPage(){
		return "VendorReg";
	}
	
	// Vendor Registation Page 
	@RequestMapping(value="/saveVen",method=RequestMethod.POST)
	public String saveVen(@ModelAttribute("vendor")Vendor ven,ModelMap map){
		int venId=service.saveVendor(ven);
		String message="Your Registration from Submited sucessfuly:"+venId;
		map.addAttribute("msg",message);
		return "VendorReg";
	}
	
	// Get all Records from Db to Ui page
	@RequestMapping("/viewData")
	public String AllData(ModelMap map){
		List<Vendor> ven=service.getAllVendors();
		map.addAttribute("vendor",ven);
		return "VendorData";
	}
	// Delete Vendor Record
	@RequestMapping("/deleteVen")
	public String deleteVen(@RequestParam("venId") int venId){
		service.deleteVendor(venId);
		return "redirect:viewData";
	}
	
	// Vendor Edit Ui page
	@RequestMapping("/editVendor")
	public String EditVendor(@RequestParam("venId")int venId,ModelMap map){
		Vendor vens=service.getVendorById(venId);
		map.addAttribute("ven",vens);
		Uiutil.addComponent(map);
		return "VendorDataEdit";
	}
	// update Vendor Record
	@RequestMapping(value="/updateVendor",method=RequestMethod.POST)
	public String UpdateVendor(@ModelAttribute("vendor") Vendor ven){
		service.updateVendor(ven);
		return "redirect:viewData";
	}
	// Data Export to Exel Format
	@RequestMapping("/ExelViewData")
	public String ExcelVicewdata(ModelMap map){
		List<Vendor> ven=service.getAllVendors();
		map.addAttribute("vens",ven);
		return "ExelViewData";
	}
	
	// data export to Pdf File
	@RequestMapping("/PdfViewData")
	public String pdfViewData(ModelMap map){
		List<Vendor> ven=service.getAllVendors();
		map.addAttribute("vens", ven);
		return "PdfViewData";
		// Vendor Report Generator 
	}
		@RequestMapping("/VenReport")
		public String reportGenerator(){
			List<Object[]> list=service.getVendorReport();
			String path=context.getRealPath("/");
			util.generatorPie(path, list);
			util.generatorBar(path, list);
			return "VendorReportView";
		}
	
}
