package org.java.soap.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.java.soap.bean.Employee;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDAO {

	List<Employee> emplist = new ArrayList<Employee>();
	Map<Integer, Employee> empMap = new HashMap<Integer, Employee>();

	public EmployeeDAO() {
		System.out.println("In EmployeeDAO constructor");
		empMap.put(1001, new Employee(1001, "Shamili", "T"));
		empMap.put(1002, new Employee(1002, "Asvi", "P"));
		empMap.put(1003, new Employee(1003, "Ivaan", "L"));
		empMap.put(1004, new Employee(1004, "Jessi", "G"));
		empMap.put(1005, new Employee(1005, "Mickey", "M"));

	}


	public List<Employee> getAllEmployees() {
		System.out.println("In EmployeeDAO getAllEmployees");
		return new ArrayList<Employee>(empMap.values());
	}

	public Employee getEmployeeById(int id) {
		System.out.println("In EmployeeDAO getEmployeeById for id :: "+id);
		if (empMap.containsKey(id)) {
			return empMap.get(id);
		} else {
			return null;
		}
	}
}
