package com.bridelabz.EmployeePayrollApp.service;

import java.util.List;

import javax.validation.Valid;

import com.bridelabz.EmployeePayrollApp.dto.PayrollDTO;
import com.bridelabz.EmployeePayrollApp.entity.PayrollModel;

public interface IPayrollService {
	List<PayrollModel> getAllEmp();
	PayrollModel getEmpById(int id);
	void deleteEmpById(int id);
	void updateEmpById(PayrollModel data, int id);
	PayrollModel addEmp(@Valid PayrollDTO data);
	PayrollModel getEmpByDept(String dept);
}
