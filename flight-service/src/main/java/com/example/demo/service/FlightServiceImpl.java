package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IFlightDao;
import com.example.demo.model.FlightModel;

@Service
public class FlightServiceImpl implements IFlightService{
	@Autowired
	IFlightDao dao;

	@Override
	public List<FlightModel> getAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public FlightModel getById(int id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}

	@Override
	public List<FlightModel> getByFT(String from, String to) {
		// TODO Auto-generated method stub
		List <FlightModel> ca= dao.findAll();
		List <FlightModel> c= new ArrayList();
		for(FlightModel i:ca) {
			if (from.equals(i.getFrom_location()) && to.equals(i.getTo_location())) {
				c.add(i);
			}
		}
		return c;
	}

	@Override
	public FlightModel addFlight(FlightModel f) {
		// TODO Auto-generated method stub
		return dao.save(f);
	}
	
	

}
