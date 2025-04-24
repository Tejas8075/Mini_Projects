package com.project.serviceimpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dto.CounsellorDto;
import com.project.repository.CounsellorRepository;
import com.project.service.CounsellorService;

@Service
public class CounsellorServiceImpl implements CounsellorService {

	@Autowired
	private CounsellorRepository counsellorRepository;

	@Override
	public CounsellorDto login(String email, Integer pwd) {
		// TODO Auto-generated method stub
		
		
		
		return null;
	}

	@Override
	public boolean isEmailUnique(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean register(CounsellorDto counsellorDto) {
		// TODO Auto-generated method stub		
		return false;
	}
	
//	@Override
//	public void registerCounsellor(Counsellor counsellor) {
//		
//		counsellorRepository.save(counsellor);
//
//	}
//
//	@Override
//	public Optional<Counsellor> loginCounsellor(String email, Integer password) {
//		
//		Optional<Counsellor> verifycounsellor = counsellorRepository.findByEmailAndPwd(email, password);
//		
//		if(verifycounsellor!=null) {
//			return verifycounsellor;
//		}
//		else {
//			return Optional.empty();
//		}
//		
//	}

	

}
