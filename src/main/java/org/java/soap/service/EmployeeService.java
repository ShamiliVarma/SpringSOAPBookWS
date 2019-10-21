package org.java.soap.service;

import java.util.List;

import javax.jws.WebService;

import org.java.soap.bean.Employee;
import org.java.soap.dao.EmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
@WebService(serviceName="EmployeeService", endpointInterface =
"org.java.soap.service.IEmployeeService", portName = "EmployeeServicePort")
//@ComponentScan("org.java")
public class EmployeeService implements IEmployeeService{

	ApplicationContext ctx; //Spring bean util
	//@Autowired
	EmployeeDAO empDAO;
	public List<Employee> getEmployeeList(){
		System.out.println("In getEmployeeList");
		 ctx = new ClassPathXmlApplicationContext("beans.xml");
		empDAO = (EmployeeDAO) ctx.getBean("employeeDAO");

		return empDAO.getAllEmployees();

	}

	public Employee getEmployeeById(int empId) {
		System.out.println("In getEmployeeById :: ");
		 ctx = new ClassPathXmlApplicationContext("beans.xml");

		empDAO = (EmployeeDAO) ctx.getBean("employeeDAO");
		return empDAO.getEmployeeById(empId); } 

}

