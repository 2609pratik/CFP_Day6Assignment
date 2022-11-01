package com.bridelabz.EmployeePayrollApp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bridelabz.EmployeePayrollApp.entity.PayrollModel;

@Repository
public interface PayrollRepository extends JpaRepository<PayrollModel, Integer> {

	@Query(value = "Select * from payroll_model WHERE department=dept",nativeQuery = true)
	Optional<PayrollModel> findByDeprtment(String dept);

	
}
