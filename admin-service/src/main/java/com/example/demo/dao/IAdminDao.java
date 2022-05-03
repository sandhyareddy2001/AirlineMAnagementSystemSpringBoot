package com.example.demo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.FlightModelDto;
import com.example.demo.model.UserModel;

@Repository

@Transactional
public interface IAdminDao extends JpaRepository<UserModel, Integer>{
	//public List<FlightModelDto> getFlights();

}
