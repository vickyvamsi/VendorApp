package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.model.Item;
import com.app.service.IItemService;
/*
@Controller
public class ItemController {
	@Autowired
	private IItemService service;
	
	@RequestMapping("/regItem")
	public String shouItemPage(){
		return "ItemReg";
	}
	
	@RequestMapping(value="/saveItemReg",method=RequestMethod.POST)
	public String ItemReg(@ModelAttribute("item")Item item,ModelMap map){
		
		int itemId=service.saveItem(item);
		String message="Your Item save Sucessfully:"+itemId;
		map.addAttribute("msg",message);
		return "ItemReg";
	}
	// view ALl Items Data 
	@RequestMapping("/showItems")
	public String showItems(ModelMap map){
		List<Item> items=service.getAllItems();
		map.addAttribute("items",items);
		return "ItemsData";
	}
	//delete Item Record from DB
	@RequestMapping("/deleteItem")
	public String deleteItem(@RequestParam("itemId")int itemId){
		service.deleteItem(itemId);
		return "redirect:showItems";
	}
	//edit Item Data to Db
	@RequestMapping("/editItem")
	public String updateItem(@RequestParam("itemId")int itemId,ModelMap map){
			Item items=service.getItemById(itemId);
		map.addAttribute("item",items);
		return "EditItemData";
	}
	
	//Update Item Data to Db
	@RequestMapping(value="/updateItem",method=RequestMethod.POST)
	public String updateItems(@ModelAttribute("item")Item item){
		service.updateItem(item);
		
		return "redirect:showItems";
	}
	// item Data Excel view
	@RequestMapping("/itemExcelView")
	public String excelView(ModelMap map){
		List<Item> item=service.getAllItems();
		map.addAttribute("item",item);
		return "ItemExcelData";
	}
	// item Pdf View 
	@RequestMapping("/itempdfView")
	public String pdfView(ModelMap map){
		List<Item> item=service.getAllItems();
		map.addAttribute("item",item);
		return "ItemPdfData";
	}
	
} */
