package com.app.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.ILocationDao;
import com.app.model.Location;
import com.app.service.ILocationService;
@Service
public class LocationServiceImpl implements ILocationService {
	@Autowired
	private ILocationDao dao;
	@Override
	public int saveLocation(Location loc) {

		return dao.saveLocation(loc);
	}

	@Override
	public void updateLocation(Location loc) {
		// TODO Auto-generated method stub

		dao.updateLocation(loc);
	}

	@Override
	public void deleteLocaton(int locId) {
		// TODO Auto-generated method stub

		dao.deleteLocaton(locId);
	}

	@Override
	public Location getLocationById(int locId) {
		// TODO Auto-generated method stub
		return dao.getLocationById(locId);
	}
	

	@Override
	public List<Location> getAllLocations() {
		// TODO Auto-generated method stub
		return dao.getAllLocations();
	}
	@Override
	public List<Object[]> getLoctionTypeCount() {
		return dao.getLoctionTypeCount();
	}
	
}
