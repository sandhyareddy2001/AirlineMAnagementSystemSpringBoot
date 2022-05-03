package com.example.demo.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.AdminFeignProxy;
import com.example.demo.model.FlightModelDto;
import com.example.demo.model.PassengerModelDto;
import com.example.demo.model.UserModel;
import com.example.demo.service.IAdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	IAdminService service;
	
		
	
	@GetMapping("/")
	public String hi() {
		return "This is Admin!";
	}
	@GetMapping("/getAll")
	public List<UserModel> all(){
		return service.showAllUsers();
	}
	@PostMapping("/addUser")
	public UserModel add(UserModel u) {
		return service.addUser(u);
	}
	
	@GetMapping("/getAllFlights")
	public List<FlightModelDto> allFlights(){
		return service.getFlights();
	}
	@GetMapping("/getAllPassengers")
	public List<PassengerModelDto> allPassengers(){
		return service.getPassengers();
	}
	
	@PostMapping("/addPassenger")
	public PassengerModelDto addP(PassengerModelDto p) {
		return service.addPassengers(p);
	}
	
	

}
