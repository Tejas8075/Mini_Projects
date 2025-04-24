package com.project.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.entities.Enquiries;
import com.project.repository.EnquiryRepository;
import com.project.service.EnquiriesService;

@Service
public class EnquiriesServiceImpl implements EnquiriesService {

	@Autowired
	private EnquiryRepository enquiryRepository;
	
	@Override
	public String addEnquiry(Enquiries enquiries) {
		
		enquiryRepository.save(enquiries);
		
		String msg = "Enquiry added successfully";
		
		return msg;
		
	}

	@Override
	public List<Enquiries> displayEnquiries(String class_mode, String course_name, String enq_status) {
		
		if(class_mode != null && course_name == null && enq_status == null) {
			List<Enquiries> enquiries = enquiryRepository.findByClassMode(enq_status);
			return enquiries;
		}
		else if(class_mode == null && course_name != null && enq_status == null) {
			List<Enquiries> enquiries = enquiryRepository.findByCourseName(course_name);
			return enquiries;
		}
		else if(class_mode == null && course_name == null && enq_status != null) {
			List<Enquiries> enquiries = enquiryRepository.findByEnqStatus(enq_status);
			return enquiries;
		}
		else if(class_mode != null && course_name != null && enq_status == null) {
			List<Enquiries> enquiries = enquiryRepository.findByClassModeAndCourseName(class_mode, course_name);
			return enquiries;
		}
		else if(class_mode != null && course_name == null && enq_status != null) {
			List<Enquiries> enquiries = enquiryRepository.findByClassModeAndEnqStatus(class_mode, enq_status);
			return enquiries;
		}
		else if(class_mode == null && course_name != null && enq_status != null) {
			List<Enquiries> enquiries = enquiryRepository.findByCourseNameAndEnqStatus(course_name, enq_status);
			return enquiries;
		}
		else{
			List<Enquiries> enquiries = enquiryRepository.findByClassModeAndCourseNameAndEnqStatus(class_mode, course_name, enq_status);
			return enquiries;
		}
		
	}

}
