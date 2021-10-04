package com.emp.employee.service;

import java.util.List;

import com.emp.employee.entity.Employee;

public interface EmployeeService {
	public void saveEmp(Employee employee);

	public List<Employee> getEmployees();

	public void deleteEmp(int theId);

    public Employee getEmp(int theId);

	
    public boolean checkLogin(String employee_id, String password);


}
