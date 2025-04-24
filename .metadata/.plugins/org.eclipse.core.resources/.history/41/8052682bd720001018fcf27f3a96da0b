package com.project.entities;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "ENQUIRIES_TABLE")
@Setter
@Getter
public class Enquiries {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ENQUIRY_ID")
	private Integer enq_id;
	
	@Column(name = "COUNSELLOR_NAME")
	private String name;
	
	@Column(name = "COUNSELLOR_PHONE_NO")
	private Double phNo;
	
	@Column(name = "CLASS_MODE")
	private String classMode;
	
	@Column(name = "COURSE_NAME")
	private String courseName;
	
	@Column(name = "ENQUIRY_STATUS")
	private String enqStatus;
	
	@ManyToOne
	@JoinColumn(name = "counsellor_id")
	private Counsellor counsellorId;
	
	@CreationTimestamp
	private LocalDateTime createdDateTime;
	
	@UpdateTimestamp
	private LocalDateTime updatedDateTime;
	
}
