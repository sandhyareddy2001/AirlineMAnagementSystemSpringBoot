package com.example.demo.service;

import java.util.List;

import com.example.demo.model.FlightModel;

public interface IFlightService {
	public List <FlightModel> getAll();
	public FlightModel getById(int id);
	public List <FlightModel> getByFT(String from, String to);
	public FlightModel addFlight(FlightModel f);
	
	
}
