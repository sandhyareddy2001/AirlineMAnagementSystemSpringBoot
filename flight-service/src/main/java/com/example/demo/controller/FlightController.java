package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.FlightModel;
import com.example.demo.service.IFlightService;

@RestController
public class FlightController {

	@Autowired
	RestTemplate template;
	
	@Autowired
	IFlightService service;
	
	@GetMapping("/")
	public String gl(){
		return "dcfvghbjn";
	}
	
	@GetMapping("/getAll")
	public List<FlightModel> getAll(){
		return service.getAll();
	}
	
	@GetMapping("/getBy/from/{from}/to/{to}")
	public List<FlightModel> findByFT(@PathVariable("from") String from,@PathVariable("to") String to){
		return service.getByFT(from, to);
	}

	@GetMapping("/findBy/fid/{id}")
	public FlightModel searchById(@PathVariable("id") Integer id){
		return service.getById(id);
	}
	@PostMapping("/addFlight")
	public FlightModel insertFlight(FlightModel f) {
		return service.addFlight(f);
	}


}
