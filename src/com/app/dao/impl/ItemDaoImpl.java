package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IItemDao;
import com.app.model.Item;
@Repository
public class ItemDaoImpl implements IItemDao {

	@Autowired
	private HibernateTemplate ht;
	
	@Override
	public int saveItem(Item item) {
			int itemId=(Integer)ht.save(item);
				return itemId;
	}

	@Override
	public void updateItem(Item item) {
		ht.update(item);
	}

	@Override
	public void deleteItem(int itemId) {
			
		Item item=new Item();
			item.setItemId(itemId);
			ht.delete(item);
			
			
	}

	@Override
	public Item getItemById(int itemId) {
			Item list=ht.get(Item.class,itemId);
			return list;
	}

	@Override
	public List<Item> getAllItems() {
			List<Item> list=ht.loadAll(Item.class);
		return list;
	}

}
