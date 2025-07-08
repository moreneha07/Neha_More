package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Doctor;
import com.example.demo.repository.DoctorRepository;

@Service
public class DoctorService {
	@Autowired
DoctorRepository dr;
    public String addDoctor(Doctor d) {
      dr.save(d);
        return "Doctor is added";  
    }
}
