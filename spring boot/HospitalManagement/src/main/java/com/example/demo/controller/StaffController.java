package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Staff;
import com.example.demo.service.StaffService;

@RestController
public class StaffController {

    @Autowired
    private StaffService ss;

    @PostMapping("/staff")
    public String addStaff(@RequestBody Staff s) {
        ss.addStaff(s);
        return "Staff added successfully";
    }
}
