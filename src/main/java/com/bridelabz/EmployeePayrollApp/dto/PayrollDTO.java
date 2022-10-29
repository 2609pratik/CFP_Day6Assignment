package com.bridelabz.EmployeePayrollApp.dto;

import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.Pattern;

import com.bridelabz.EmployeePayrollApp.entity.PayrollModel;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class PayrollDTO {
	
	private String profilePic;
	@Pattern(regexp = "^[M,F]",message = "invalid")
	private String gender;
	private String department;
	@Pattern(regexp = "^[1-9,0]",message = "invalid")
	private long salary;
	private LocalDate startDate = LocalDate.now();
	private String note;
	public PayrollDTO(List<PayrollModel> data) {
		super();
		this.profilePic = profilePic;
		this.gender = gender;
		this.department = department;
		this.salary = salary;
		this.startDate = startDate;
		this.note = note;
	}
//	public PayrollDTO(List<PayrollModel> findAll) {
//	}
	
}
