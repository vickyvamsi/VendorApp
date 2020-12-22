package com.app.util;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;

@Component
public class addUiComponentUtil {
	
	// Radio operation
	public List<String> getvenType(){
		return Arrays.asList("CONTRACT","FULL TIME","PART TIME");
	}
	
	//Select options Ui component
	public List<String> getvenIdType(){
		return Arrays.asList("PAN","VOTER ID","OTHER");
	}
	// customer Module Ui Components Properties 
	public List<String> getcustType(){
		return Arrays.asList("Consumer","Seller");
	}
	
	
	public void addComponent(ModelMap map){
		map.addAttribute("venTypeId",getvenType());
		map.addAttribute("venIdType", getvenIdType());
		map.addAttribute("UicustType", getcustType());
	}

	
}
