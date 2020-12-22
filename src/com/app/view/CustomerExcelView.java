package com.app.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import com.app.model.Customer;

public class CustomerExcelView extends AbstractExcelView {

	@Override
	protected void buildExcelDocument(Map<String, Object> map,
			HSSFWorkbook book, HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		// TODO Auto-generated method stub
		res.addHeader("Content-Disposition","attachment;filename=Customer.xls");
	
		List<Customer> custs=(List<Customer>) map.get("custs");
		HSSFSheet sheet=book.createSheet();
		setBody( sheet);
		setBody( sheet, custs);
	}
	
	private void setBody(HSSFSheet sheet){
		int rowcount=0;
		HSSFRow row=sheet.createRow(rowcount);
		row.createCell(0).setCellValue("ID");
		row.createCell(1).setCellValue("NAME");
		row.createCell(2).setCellValue("EMAIL");
		row.createCell(3).setCellValue("TYPE");
		row.createCell(4).setCellValue("ADDRESS");
		/* row.createCell(5).setCellValue("PASSWORD");
		row.createCell(6).setCellValue("TOCKEN");
		*/
	}
	private void setBody(HSSFSheet sheet,List<Customer> custs){
		int rowcount=1;
		for(Customer cust:custs){
			HSSFRow row=sheet.createRow(rowcount++);
			row.createCell(0).setCellValue(cust.getCustId());
			row.createCell(1).setCellValue(cust.getCustName());
			row.createCell(2).setCellValue(cust.getCustEmail());
			row.createCell(3).setCellValue(cust.getCustType());
			row.createCell(4).setCellValue(cust.getCustAddr());
			/* row.createCell(5).setCellValue(cust.getPassword());
			row.createCell(6).setCellValue(cust.getAccTock());
			*/
		}
	}

}
