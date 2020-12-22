package com.app.view;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.app.model.Location;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class LocationPdfView extends AbstractPdfView{

	@Override
	protected void buildPdfDocument(Map<String, Object> map, Document doc,
			PdfWriter pw, HttpServletRequest req, HttpServletResponse res)
					throws Exception {
		// TODO Auto-generated method stub

		res.addHeader("Content-Disposition", "attachment;filename=LocationPdf.pdf");
		
		List<Location> locs=(List<Location>)map.get("locs");

		Paragraph p=new Paragraph("Location Data Pdf file ");
		PdfPTable t=new PdfPTable(5);
		t.addCell("Id");
		t.addCell("Name");
		t.addCell("Code");
		t.addCell("Type");
		t.addCell("Note");

		for(Location loc:locs){
			t.addCell(loc.getLocId()+"");
			t.addCell(loc.getLocName());
			t.addCell(loc.getLocCode());
			t.addCell(loc.getLocType());
			t.addCell(loc.getLocDesc());

		}
		doc.add(p);
		doc.add(t);
		
		doc.add(new Paragraph(new Date(0).toString()));



	}

}
