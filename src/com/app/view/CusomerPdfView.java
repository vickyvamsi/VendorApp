package com.app.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.app.model.Customer;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class CusomerPdfView extends AbstractPdfView{

	@Override
	protected void buildPdfDocument(Map<String, Object> map, Document doc,
			PdfWriter pw, HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		// TODO Auto-generated method stub
		res.addHeader("Content-Disposition","attachment;filename=CustomerData.pdf");
		List<Customer>custs=(List<Customer>) map.get("cust");
		
		String s="Customer Data Given to the Andhra Pradesh Govt";
		Paragraph p=new Paragraph(s);
		PdfPTable t=new PdfPTable(7);
		
				t.addCell("ID");
				t.addCell("NAME");
				t.addCell("EMAIL");
				t.addCell("TYPE");
				t.addCell("ADDRESS");
				/*t.addCell("PASSWORD");
				t.addCell("TOCKEN");
				*/
				
				for(Customer cust:custs){
					t.addCell(cust.getCustId()+"");
					t.addCell(cust.getCustName());
					t.addCell(cust.getCustEmail());
					t.addCell(cust.getCustType());
					t.addCell(cust.getCustAddr());
					/*t.addCell(cust.getPassword());
					t.addCell(cust.getAccTock());
					*/
				}
				doc.add(t);
				doc.add(p);
	}

}
