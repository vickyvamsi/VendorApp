package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IDocumentDao;
import com.app.model.Document;
@Repository
public class DocumnetDaoImpl implements IDocumentDao {
	@Autowired
	public HibernateTemplate ht;
	
	@Override
	public int saveDocumnet(Document doc) {
		//int fileId=(Integer)ht.save(doc);
		return (Integer)ht.save( doc);
	}

	@Override
	public List<Object[]> getDocFileData() {
			String Hql="select fileId,fileName from com.app.model.Document";
			List<Object[]> obs=ht.find(Hql);
			return obs;
	}
@Override
public Document getDocById(int fileId) {
	return	ht.get(Document.class,fileId);
	
}
}
