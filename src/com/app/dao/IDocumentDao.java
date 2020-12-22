package com.app.dao;

import java.util.List;

import com.app.model.Document;

public interface IDocumentDao {

	public int saveDocumnet(Document doc);
	public List<Object[]> getDocFileData();
	public Document getDocById(int fileId);
}
