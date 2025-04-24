package com.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entities.Enquiries;

public interface EnquiryRepository extends JpaRepository<Enquiries, Integer> {
	
	List<Enquiries> findByClassMode(String classMode);
	
	List<Enquiries> findByCourseName(String courseName);

	List<Enquiries> findByEnqStatus(String enqStatus);

	List<Enquiries> findByClassModeAndCourseName(String classMode, String courseName);

	List<Enquiries> findByClassModeAndEnqStatus(String classMode, String enqStatus);

	List<Enquiries> findByCourseNameAndEnqStatus(String courseName, String enqStatus);

	List<Enquiries> findByClassModeAndCourseNameAndEnqStatus(String classMode, String courseName, String enqStatus);

}
