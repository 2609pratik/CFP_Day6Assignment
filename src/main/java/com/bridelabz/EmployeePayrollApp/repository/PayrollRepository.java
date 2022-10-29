package com.bridelabz.EmployeePayrollApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bridelabz.EmployeePayrollApp.entity.PayrollModel;

@Repository
public interface PayrollRepository extends JpaRepository<PayrollModel, Integer> {
	
}
