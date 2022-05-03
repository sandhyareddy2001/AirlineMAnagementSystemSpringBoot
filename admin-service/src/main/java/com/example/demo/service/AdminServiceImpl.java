package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.AdminFeignProxy;
import com.example.demo.AdminFeignProxyPassenger;
import com.example.demo.dao.IAdminDao;
import com.example.demo.model.FlightModelDto;
import com.example.demo.model.PassengerModelDto;
import com.example.demo.model.UserModel;

@Service
public class AdminServiceImpl  implements IAdminService{
	
	@Autowired
	IAdminDao dao;
	
	@Autowired
	AdminFeignProxy proxy;
	
	@Autowired
	AdminFeignProxyPassenger proxyP;
	
	@Autowired
	RestTemplate template;

	@Override
	public List<UserModel> showAllUsers() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public UserModel addUser(UserModel u) {
		// TODO Auto-generated method stub
		return dao.save(u);
	}


	public List<FlightModelDto> getFlights() {
		// TODO Auto-generated method stub
		return proxy.getAll();
//		return template.getForObject("http://localhost:8799/getAll", List.class);
	
	}

	@Override
	public List<PassengerModelDto> getPassengers() {
		// TODO Auto-generated method stub
		return proxyP.getAll();
	}

	@Override
	public PassengerModelDto addPassengers(PassengerModelDto p) {
		// TODO Auto-generated method stub
		return proxyP.addPassenger(p);
	}

}
