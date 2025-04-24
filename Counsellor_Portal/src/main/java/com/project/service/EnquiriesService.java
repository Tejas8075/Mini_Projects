package com.project.service;


import java.util.List;

import com.project.dto.DashboardDto;
import com.project.dto.EnquiryDto;

public interface EnquiriesService {

//	String addEnquiry(Enquiries enquiries);
	
//	List<Enquiries> displayEnquiriesByClassMode(String class_mode);
//	
//	List<Enquiries> displayEnquiriesByCourseName(String course_name);
//
//	List<Enquiries> displayEnquiriesByEnqStatus(String enq_status);
	
//	List<Enquiries> displayEnquiries(String classMode, String courseName, String enqStatus);
	
	
//	Get the Info of enquiries of a particular counsellor
	DashboardDto getDashboardInfo(Integer counsellorId);
	
//	Insert Or Update Enquiry of a particular counsellor 
	boolean upsertEnquiry(EnquiryDto enqDto, Integer counsellorId);
	
//	Get enquiries of particular Counsellor
	List<EnquiryDto> getEnquiries(Integer counsellorId);
	
//	filter and display enquiries based on Counsellor
	List<EnquiryDto> filterEnqs(EnquiryDto filterDto, Integer counsellorId);
	
//	Get a particular enquiry based on enqId and give it to upsert method so it can update that enquiry
	EnquiryDto getEnquiry(Integer enqId);
	
}
