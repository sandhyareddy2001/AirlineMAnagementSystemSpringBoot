package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.PassengerModel;
import com.example.demo.service.IPassengerService;


@RestController
public class PassengerController {
	@Autowired
	RestTemplate template;
	@Autowired
	IPassengerService service;
	
	@GetMapping("/")
	public String gl(){
		return "dcfvghbjn";
	}
	@GetMapping("/getAll")
	public List<PassengerModel> getAll(){
		return service.showAllPassengers();
	}
	@PostMapping("/register")
	public PassengerModel addPassenger(PassengerModel p){
		return service.insert(p);
	}

}
