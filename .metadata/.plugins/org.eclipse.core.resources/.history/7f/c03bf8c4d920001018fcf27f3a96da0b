package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.entities.Enquiries;
import com.project.serviceimpl.EnquiriesServiceImpl;

@RestController
@RequestMapping("/enquiries")
public class EnquiriesRestController {

	@Autowired
	private EnquiriesServiceImpl enquiriesServiceImpl;
	
	@PostMapping
	ResponseEntity<String> addEnquiry(@RequestBody Enquiries enquiries){
		
		enquiriesServiceImpl.addEnquiry(enquiries);
		
		String msg = "Enquiry added successfully";
		
		return new ResponseEntity<String>(msg, HttpStatus.CREATED);
		
	}
	
	@GetMapping
	ResponseEntity<List<Enquiries>> dispalyEnquiry(@RequestParam String class_mode, @RequestParam String course_name, @RequestParam String enq_status){
		
		List<Enquiries> enquiries = enquiriesServiceImpl.displayEnquiries(class_mode, course_name, enq_status);
		
		return new ResponseEntity<List<Enquiries>>(enquiries, HttpStatus.OK);
		
	}
	
}
