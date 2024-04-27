package com.telusko.service;

import java.util.ArrayList;

import com.telusko.model.Employee;

public interface EmpService {
	ArrayList<Employee> findAllEmployee();

	Employee findAllEmployeeById(long id);

	void addEmployee();

	void deleteAllData();
}
