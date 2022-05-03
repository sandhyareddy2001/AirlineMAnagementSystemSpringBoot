package com.example.demo.service;

import java.util.List;

import com.example.demo.model.FlightModelDto;
import com.example.demo.model.PassengerModelDto;
import com.example.demo.model.UserModel;

public interface IAdminService {
	public List<UserModel> showAllUsers();
	public UserModel addUser(UserModel u);
	public List<FlightModelDto> getFlights();
	public List<PassengerModelDto> getPassengers();
	public PassengerModelDto addPassengers(PassengerModelDto p);
	

}
