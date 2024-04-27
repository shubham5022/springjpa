package com.telusko.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.model.Employee;
import com.telusko.repository.EmployeeRepository;

@Service
public class EmpServiceImpl implements EmpService {
	
	@Autowired
	EmployeeRepository employeerepository;

	@Override
	public ArrayList<Employee> findAllEmployee() {
	    // Call findAll method of employeerepository and assign the result to a variable
	    ArrayList<Employee> employees = (ArrayList<Employee>) employeerepository.findAll();
	    
	    // Return the ArrayList<Employee> containing all employees
	    return employees;
	}

	@Override
	public Employee findAllEmployeeById(long id) {
	    return employeerepository.findById(id).orElse(null);
	}

	@Override
    public void addEmployee() {
        ArrayList<Employee> emp = new ArrayList<Employee>();
        emp.add(new Employee("Lucknow", "Shubham"));
        emp.add(new Employee("Delhi", "Puneet"));
        emp.add(new Employee("Pune", "Abhay"));
        emp.add(new Employee("Noida", "Anurag"));
        for (Employee employee : emp) {
            employeerepository.save(employee);
        }
    }
  

	@Override
    public void deleteAllData() {
        employeerepository.deleteAll();
    }

}
