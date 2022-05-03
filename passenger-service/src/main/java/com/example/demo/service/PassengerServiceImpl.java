package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IPassengerDao;
import com.example.demo.model.PassengerModel;

@Service
public class PassengerServiceImpl implements IPassengerService{
	@Autowired
	IPassengerDao dao;
	
	

	@Override
	public List<PassengerModel> showAllPassengers() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public PassengerModel insert(PassengerModel p) {
		// TODO Auto-generated method stub
		return dao.save(p);
	}

	@Override
	public String resetPswd(String uname) {
		// TODO Auto-generated method stub
		return null;
	}

}
