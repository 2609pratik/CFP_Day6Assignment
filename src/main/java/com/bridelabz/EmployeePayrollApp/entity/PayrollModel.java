package com.bridelabz.EmployeePayrollApp.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import com.bridelabz.EmployeePayrollApp.dto.PayrollDTO;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
//@Table(name = "payroll_model")
@Data
@NoArgsConstructor
public class PayrollModel {
	@Id
	@GeneratedValue
	private int id;
	private String profilePic;
	private String gender;
//	@OneToMany
//	private List<String> department;
	private long salary;
	private LocalDate startDate = LocalDate.now();
	private String note;
	
@ElementCollection
	//@OneToMany
	//@ManyToMany
	//@ManyToOne
@CollectionTable(name = "payroll_department" , joinColumns = @JoinColumn(name= "empId"))
@Column(name = "department")
//	@OneToMany
private List<String> department;
	
	public PayrollModel(PayrollDTO data) {
		this.id=getId();
		this.profilePic = data.getProfilePic();
		this.gender = data.getGender();
		this.department = data.getDepartment();
		this.salary = data.getSalary();
		this.startDate = data.getStartDate();
		this.note = data.getNote();
	}
}
