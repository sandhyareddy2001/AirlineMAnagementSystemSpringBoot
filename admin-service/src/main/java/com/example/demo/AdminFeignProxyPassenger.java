package com.example.demo;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.PassengerModelDto;

@FeignClient(name="PASSENGER-SERVICE")
public interface AdminFeignProxyPassenger {
	@GetMapping("/getAll")
	public List<PassengerModelDto> getAll();
	@PostMapping("/register")
	public PassengerModelDto addPassenger(PassengerModelDto p);


}
