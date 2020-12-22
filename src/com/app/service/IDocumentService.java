package com.app.service;

import java.util.List;

import com.app.model.Document;

public interface IDocumentService {

	public int saveDocumnet(Document doc);
	public List<Object[]> getDocFileData();
	public Document getDocById(int fileId);
}
