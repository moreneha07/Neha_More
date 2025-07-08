package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Doctor;
import com.example.demo.service.DoctorService;

@RestController
public class DoctorController {
	@Autowired
   DoctorService ds;
	@PostMapping("addDoctor")
	public String addDoctor( @RequestBody  Doctor d) {
		ds.addDoctor(d); 
		return "Doctor added"; 
	}
}
