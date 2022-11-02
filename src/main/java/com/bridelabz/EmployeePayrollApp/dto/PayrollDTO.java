package com.bridelabz.EmployeePayrollApp.dto;

import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@Data
public class PayrollDTO {
	@Pattern(regexp="[A-Z]{1}[a-z]{2,}$",message = "invalid data")
	private String profilePic;
	@Pattern(regexp = "[M,F]{1}$",message = " invalid")
	private String gender;
	private List<String> department;
	@Min(value=1000,message = "value greater than 1000")
	private long salary;
	private LocalDate startDate = LocalDate.now();
	@NotBlank(message = "cannoy be empty")
	private String note;
	public PayrollDTO(String profilePic, String gender,List<String> department,long salary, LocalDate startDate,String note) {
		super();
		this.profilePic = profilePic;
		this.gender = gender;
		this.department = department;
		this.salary = salary;
		this.startDate = startDate;
		this.note = note;
	}

}
