
package com.bridelabz.EmployeePayrollApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridelabz.EmployeePayrollApp.dto.PayrollDTO;
import com.bridelabz.EmployeePayrollApp.entity.PayrollModel;
import com.bridelabz.EmployeePayrollApp.repository.PayrollRepository;

@Service
public class PayrollService implements IPayrollService {

	@Autowired
	PayrollRepository repo;
	public List<PayrollModel> getAllEmp() {
		return repo.findAll() ;
	}
	
	public PayrollModel addEmp(PayrollDTO data) {
		PayrollModel newEmp = new PayrollModel(data);
		repo.save(newEmp);
		return newEmp ;
	}
	
	public PayrollModel getEmpById(int id) {
		return repo.findById(id).get();
	}
	
	public void deleteEmpById(int id) {
		repo.deleteById(id);
	}
	
	public void updateEmpById(PayrollModel data, int id) {
		PayrollModel existData = repo.findById(id).get();
		existData.setDepartment(data.getDepartment());
		existData.setGender(data.getGender());
		existData.setNote(data.getNote());
		existData.setProfilePic(data.getProfilePic());
		existData.setSalary(data.getSalary());
		repo.save(existData);
	}

	@Override
	public PayrollModel getEmpByDept(String dept) {
		return repo.findByDeprtment(dept).get();
	}

}
