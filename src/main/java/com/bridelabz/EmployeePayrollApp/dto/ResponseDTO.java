package com.bridelabz.EmployeePayrollApp.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ResponseDTO {
	private String messageString;
	private Object dataObject;
	public ResponseDTO(String messageString, Object dataObject) {
		this.messageString=messageString;
		this.dataObject = dataObject;
	}
	

	
}
