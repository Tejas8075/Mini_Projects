package com.project.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.entities.Counsellor;
import com.project.service.CounsellorService;

@RestController
@RequestMapping("/counsellor")
public class CounsellorRestController {

	@Autowired
	private CounsellorService counsellorService;
	
//	@PostMapping
//	ResponseEntity<String> registerCounsellor(@RequestBody Counsellor counsellor){
//		
//		counsellorService.registerCounsellor(counsellor);
//		
//		String msg = "User registered successfully!!!";
//
//		return new ResponseEntity<>(msg, HttpStatus.CREATED);
//		
//	}
//	
//	@GetMapping
//	ResponseEntity<Optional<Counsellor>> loginCounsellor(@RequestParam String email, @RequestParam Integer pwd){
//		
//		Optional<Counsellor> loggedIn = counsellorService.loginCounsellor(email, pwd);
//		
//		return new ResponseEntity<Optional<Counsellor>>(loggedIn, HttpStatus.OK);
//		
//	}
	
}
