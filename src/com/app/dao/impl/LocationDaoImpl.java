package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.ILocationDao;
import com.app.model.Location;
@Repository
public class LocationDaoImpl implements ILocationDao {

	@Autowired
	private HibernateTemplate ht;
	
	@Override
	public int saveLocation(Location loc) {
		int locId=(Integer)ht.save(loc);
		return locId;
	}

	@Override
	public void updateLocation(Location loc) {
		ht.update(loc);

	}

	@Override
	public void deleteLocaton(int locId) {
		/*Location loc=new Location();
		loc.setLocId(locId);
		ht.delete(loc);*/
		ht.delete(new Location(locId));
	}

	@Override
	public Location getLocationById(int locId) {
		Location loc=ht.get(Location.class, locId);
		return loc;
	}
	

	public List<Location> getAllLocations() {
		List<Location> loc=ht.loadAll(Location.class);
		return loc;
	}
	
	// Location Report Generator
	public List<Object[]> getLoctionTypeCount() {
		String hql=" select locType,count(locType) from " +Location.class.getName()+" group by locType";
			@SuppressWarnings("unchecked")
			List<Object[]> list=ht.find(hql);
		return list;
	}
	
	
	
}
