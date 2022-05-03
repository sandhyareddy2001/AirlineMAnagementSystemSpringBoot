package com.example.demo;
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.FlightModelDto;

@FeignClient(name="FLIGHT-SERVICE")
public interface AdminFeignProxy {
	@GetMapping("/getAll")
	public List<FlightModelDto> getAll();

}

