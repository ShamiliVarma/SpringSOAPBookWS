package org.java.soap.service;


import java.util.List;

import org.java.soap.bean.Employee; 
import javax.jws.WebService;

@WebService(name="IEmployeeService") 
public interface IEmployeeService {
	public List<Employee> getEmployeeList(); 
	public Employee getEmployeeById(int empId); 
}
