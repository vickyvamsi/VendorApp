package com.app.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.app.model.Item;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class ItemPdfView extends AbstractPdfView{

	@Override
	protected void buildPdfDocument(Map<String, Object> map, Document doc,
			PdfWriter pw, HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		// TODO Auto-generated method stub
		res.addHeader("Content-Disposition", "attachment;filename=ItemPdfData");
		List<Item> item=(List<Item>) map.get("item");
		String s="This data will given to customer , Item Data ";
		Paragraph p=new Paragraph(s);
		PdfPTable t=new PdfPTable(5);
		t.addCell("ITEM ID");
		t.addCell("ITEM NAME");
		t.addCell("COST");
		t.addCell("DISCOUNT");
		t.addCell("CUSTOMER ID");
		for(Item it:item){
			t.addCell(it.getItemId()+"");
			t.addCell(it.getItemName());
			t.addCell(it.getItemCost()+"");
			t.addCell(it.getDiscount()+"");
			t.addCell(it.getCustId()+"");
		}
		doc.add(p);
		doc.add(t);
		
	}

}
