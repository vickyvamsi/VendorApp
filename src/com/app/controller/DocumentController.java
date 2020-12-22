package com.app.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.app.model.Document;
import com.app.service.IDocumentService;

@Controller
public class DocumentController {
	@Autowired
	private IDocumentService service;
	
	@RequestMapping("/showDoc")
	public String shoeDocs(){
		return "UploadDocs";
	}
	// Upload Documents 
	@RequestMapping(value="/uploadDocs",method=RequestMethod.POST)
		public String uplaodDoc(@RequestParam("fileId")int fileId,@RequestParam("fileOb")CommonsMultipartFile cmf,ModelMap map){
			if(cmf!=null){
				Document doc=new Document();
				doc.setFileId(fileId);
				doc.setFileName(cmf.getOriginalFilename());
				doc.setFileData(cmf.getBytes());
				service.saveDocumnet(doc);
				String message="Your Document Upload Sucessfully  ";
				map.addAttribute("msg",message);
			}
			return "UploadDocs";
		}
	// Retrive All Documents from Db to UI page
	@RequestMapping("/allUploadDoc")
		public String allDocs(ModelMap map){
		List<Object[]> obs=service.getDocFileData();
		map.addAttribute("docs",obs);
			return "AllUplaodDocs";
		}
	
	// Download Documents 
	@RequestMapping("/downloadDoc")
	public String downloadDocs(@RequestParam("fileId")int fileId,HttpServletResponse res){
		Document doc=service.getDocById(fileId);
		res.addHeader("Content-Disposition","attachment;filename="+doc.getFileName());
		try {
			FileCopyUtils.copy(doc.getFileData(),res.getOutputStream());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "redirect:allUploadDoc";
	}
	}
