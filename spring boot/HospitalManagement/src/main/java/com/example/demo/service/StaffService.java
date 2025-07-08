package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Staff;
import com.example.demo.repository.StaffRepository;

@Service
public class StaffService {
	@Autowired
	StaffRepository sr;

	public String addStaff(Staff s) {
		sr.save(s);

		return "Staff added successfully";
	}

}
