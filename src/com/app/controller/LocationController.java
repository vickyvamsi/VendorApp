
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

import com.app.model.Location;
import com.app.service.ILocationService;
import com.app.util.LocationUtil;

@Controller
public class LocationController {

	@Autowired
	private ILocationService service;
	@Autowired
	private LocationUtil util;
	@Autowired
	private ServletContext context;
	
	@RequestMapping("/regLoc")
	public String showPage(){
		return "LocationReg";
	}

	// save Data to Database

	@RequestMapping(value="/insertLoc", method=RequestMethod.POST)
	public String saveLocation(@ModelAttribute("location") Location loc,ModelMap map){

		int locId=service.saveLocation(loc);
		String message="saved With Record:"+locId;
		map.addAttribute("msg", message);
		
		return "LocationReg";
	}

	// get the data from database 
	@RequestMapping("/viewAllLoc")
	public String getAllLocatons(ModelMap map){
		List<Location> loc=service.getAllLocations();
		map.addAttribute("location", loc);
		return "LocationData";
	}

	// delete record form database to UI Page

	@RequestMapping("/deleteLoc")
	public String deleteLoc(@RequestParam("locId")int locId){
		service.deleteLocaton(locId);
		return "redirect:viewAllLoc";
	}
	
	//Eidt Record 
	
	@RequestMapping("/editLoc")
	public String editLocation(@RequestParam("locId")int locId,ModelMap map){
		Location locs=service.getLocationById(locId);
		map.addAttribute("loc", locs);
		return "EditLocationData";
	}
	
	@RequestMapping(value="/updateLoc",method=RequestMethod.POST)
	public String updateLocation(@ModelAttribute("location")Location loc){
		service.updateLocation(loc);
		return "redirect:viewAllLoc";
	}
	
	// EXport db data to Excel Format
	@RequestMapping("/locExcelView")
	public String exportExcel(ModelMap map){
		List<Location> locs=service.getAllLocations();
		map.addAttribute("locs", locs);
		return "locExcelView";
	}
	
	// Export Data to Pdf Format
	@RequestMapping("/locPdfView")
	public String pdfView(ModelMap map){
		List<Location> locs=service.getAllLocations();
		map.addAttribute("locs",locs);
		return "LocPdfView";
	}
	// Pie Chart View
	@RequestMapping("/showLocReport")
	public String generateReport(){
		List<Object[]> list=service.getLoctionTypeCount();
	//	System.out.println(list);
		String path=context.getRealPath("/");
		util.generatePie(path, list);
		util.generateBarChart(path, list); 
		return "LocationReport";
	}
	@RequestMapping("/locDetails")
	public String locDetails(@RequestParam("locId")int locId,ModelMap map){
		Location loc=service.getLocationById(locId);
		map.addAttribute("locs",loc);
		
		return "LocationDetails";
	}
	
	// serach for Location Details Primary key
	@RequestMapping(value="/searchLocation",method=RequestMethod.GET)
	public String SearchLoc(@RequestParam("locId")int locId,ModelMap map){
		
		Location loc=service.getLocationById(locId);
		
		map.addAttribute("locs",loc);
		String err="No Data Found , Please Enter Correct Id Number";
		
		if(loc==null){
			map.addAttribute("error",err);
		}
		
		return "LocationDetails";
	}
	
}
