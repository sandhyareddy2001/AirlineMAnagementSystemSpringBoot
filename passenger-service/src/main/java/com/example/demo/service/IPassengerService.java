package com.example.demo.service;

import java.util.List;

import com.example.demo.model.PassengerModel;

public interface IPassengerService {
	public List<PassengerModel> showAllPassengers();
	public PassengerModel insert(PassengerModel p);
	public String resetPswd(String uname);

}
