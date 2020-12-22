package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IDocumentDao;
import com.app.model.Document;
import com.app.service.IDocumentService;

@Service
public class DocumentServiceImpl implements IDocumentService {
		@Autowired
		private IDocumentDao dao;
	@Override
	public int saveDocumnet(Document doc) {
		
		return dao.saveDocumnet(doc);
	}

	@Override
	public List<Object[]> getDocFileData() {
		return dao.getDocFileData();
	}
@Override
public Document getDocById(int fileId) {
// TODO Auto-generated method stub
return dao.getDocById(fileId);
}
	
}
