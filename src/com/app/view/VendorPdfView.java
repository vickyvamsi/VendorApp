package com.app.view;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.app.model.Vendor;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class VendorPdfView extends AbstractPdfView{

	@Override
	protected void buildPdfDocument(Map<String, Object> map, Document doc,
			PdfWriter pw, HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		// TODO Auto-generated method stub
		res.addHeader("Content-Disposition", "attachment;filename=VendorData.pdf");
		List<Vendor> ven=(List<Vendor>) map.get("vens");
		String data="welcome to Vendor Pdf File";
		Paragraph p=new Paragraph(data);
		
		
		PdfPTable t=new PdfPTable(8);
		t.setWidths(new int[]{2,2,2,2,3,2,3,3});
		t.setWidthPercentage(100);
		t.addCell(" ID");
		t.addCell(" CODE");
		t.addCell(" NAME");
		t.addCell(" TYPE");
		t.addCell("ADDRESS");
		t.addCell("ID TYPE");
		t.addCell("ID NUMBER");
		t.addCell("DESCRIPTION");
		for(Vendor vens:ven){
			t.addCell(vens.getVenId()+"");
			t.addCell(vens.getVenCode());
			t.addCell(vens.getVenName());
			t.addCell(vens.getVenType());
			t.addCell(vens.getVenAddr());
			t.addCell(vens.getVenIdType());
			t.addCell(vens.getVenIdNum());
			t.addCell(vens.getVenDsc());
		}
		doc.add(p);
		doc.add(t);
		doc.add(new Paragraph(new Date().toString()));
		}
	}


