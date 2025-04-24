package com.project.service;

import com.project.dto.CounsellorDto;

public interface CounsellorService {

//	void registerCounsellor(Counsellor counsellor);
//	
//	Optional<Counsellor> loginCounsellor(String email, Integer password);
	
//	String updateCounsellor(Integer pwd, Counsellor counsellor);
//	
//	String deleteCounsellor(Integer pwd);
	
	CounsellorDto login(String email, Integer pwd);
	
	boolean isEmailUnique(String email);
	
	boolean register(CounsellorDto counsellorDto);
	
}
