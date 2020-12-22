package com.app.service;

import java.util.List;

import com.app.model.Item;

public interface IItemService {
	public int saveItem(Item item);
	public void updateItem(Item item);
	public void deleteItem(int itemId);
	public Item getItemById(int itemId);
	public List<Item> getAllItems();
}
