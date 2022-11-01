package com.bridelabz.EmployeePayrollApp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bridelabz.EmployeePayrollApp.dto.PayrollDTO;
import com.bridelabz.EmployeePayrollApp.dto.ResponseDTO;
import com.bridelabz.EmployeePayrollApp.entity.PayrollModel;
import com.bridelabz.EmployeePayrollApp.service.IPayrollService;

@RestController
//@RequestMapping("/employeepayrollservice")
public class PayrollController {
	
	@Autowired
	IPayrollService service ;
	
	@GetMapping("/")
	public ResponseEntity<ResponseDTO> getEmployee() {
		List<PayrollModel> getEmp =  service.getAllEmp();
		ResponseDTO response = new ResponseDTO("employee details", getEmp); 
		return new ResponseEntity<ResponseDTO> (response,HttpStatus.OK);
	}
	 
	@GetMapping("/get/{id}")
	public ResponseEntity<ResponseDTO> getEmployeeById(@PathVariable int id) {
		PayrollModel getEmp = service.getEmpById(id);
		ResponseDTO response = new ResponseDTO("employee added", getEmp); 
		return new ResponseEntity<ResponseDTO> (response,HttpStatus.OK);
	}
	
	@GetMapping("/get/{dept}")
	public ResponseEntity<ResponseDTO> getEmployeeByDept(@PathVariable String dept) {
		PayrollModel newEmp = service.getEmpByDept(dept);
		ResponseDTO response = new ResponseDTO("employee added", newEmp); 
		return new ResponseEntity<ResponseDTO> (response,HttpStatus.OK);
	}
	 
	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> addEmployee(@RequestBody @Valid PayrollDTO data) {
		PayrollModel newEmp =  service.addEmp(data);
		ResponseDTO response = new ResponseDTO("employee added", newEmp); 
		return new ResponseEntity<ResponseDTO> (response,HttpStatus.OK);
	}
	
	@PutMapping("update/{id}")
	public void updateEmp(@RequestBody PayrollModel data , @PathVariable int id ) {
		service.updateEmpById(data, id);
	}
	
	@DeleteMapping("delete/{id}")
	public void deleteMessage(@PathVariable int id ) {
		service.deleteEmpById(id);
	}

}
