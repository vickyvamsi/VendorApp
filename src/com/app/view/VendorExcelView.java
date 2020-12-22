package com.app.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import com.app.model.Vendor;

public class VendorExcelView extends AbstractExcelView{

	@Override
	protected void buildExcelDocument(Map<String, Object> map,
			HSSFWorkbook book, HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		// TODO Auto-generated method stub
		
		res.addHeader("content-Disposition","attachment;filename=VendorData.xls");
		List<Vendor> ven=(List<Vendor>) map.get("vens");
		
		HSSFSheet sheet=book.createSheet("vens");
		setHead(sheet);
		setBody( sheet,ven);
		
	}
	
	private void setHead(HSSFSheet sheet){
		int rowCount=0;
		HSSFRow row=sheet.createRow(rowCount);
		row.createCell(0).setCellValue("ID");
		row.createCell(1).setCellValue("CODE");
		row.createCell(2).setCellValue("VENDOR NAME");
		row.createCell(3).setCellValue("VENDOR TYPE");
		row.createCell(4).setCellValue("ADDRESS");
		row.createCell(5).setCellValue("ID TYPE ");
		row.createCell(6).setCellValue("ID NUMBER");
		row.createCell(7).setCellValue("DESCRIPTION");
		
	}
		private void setBody(HSSFSheet sheet,List<Vendor> ven){
			int rowCount=1;
			HSSFRow row=sheet.createRow(rowCount++);
			for(Vendor vens:ven){
				row.createCell(0).setCellValue(vens.getVenId());
				row.createCell(1).setCellValue(vens.getVenCode());
				row.createCell(2).setCellValue(vens.getVenName());
				row.createCell(3).setCellValue(vens.getVenType());
				row.createCell(4).setCellValue(vens.getVenAddr());
				row.createCell(5).setCellValue(vens.getVenIdType());
				row.createCell(6).setCellValue(vens.getVenIdNum());
				row.createCell(7).setCellValue(vens.getVenDsc());
				
				
			}
		}
}
