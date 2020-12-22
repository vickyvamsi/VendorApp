package com.app.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import com.app.model.Item;

public class ItemExcelView extends AbstractExcelView{

	@Override
	protected void buildExcelDocument(Map<String, Object> map,
			HSSFWorkbook book, HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		// TODO Auto-generated method stub
		res.addHeader("Content-Disposition", "attachment;filename=ItemData.xls");
		HSSFSheet sheet=book.createSheet("item");
		List<Item> item=(List<Item>) map.get("item");
		setHead(sheet);
		setBody(sheet,item);
	}
	private void setHead(HSSFSheet sheet){
		int rowCount=0;
		HSSFRow row=sheet.createRow(rowCount);
		row.createCell(0).setCellValue("ITEM ID");
		row.createCell(1).setCellValue("ITEM NAME");
		row.createCell(2).setCellValue("COST");
		row.createCell(3).setCellValue("DISCOUNT");
		row.createCell(4).setCellValue("CUSTOMER ID");
	}
	private void setBody(HSSFSheet sheet,List<Item> item){
		int rowCount=1;
		for(Item it:item){
			HSSFRow row=sheet.createRow(rowCount++);
			row.createCell(0).setCellValue(it.getItemId());
			row.createCell(1).setCellValue(it.getItemName());
			row.createCell(2).setCellValue(it.getItemCost());
			row.createCell(3).setCellValue(it.getDiscount());
			row.createCell(4).setCellValue(it.getCustId());
		}
	}
}
