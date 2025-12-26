package com.anurag.employee_management_system;

import java.util.*;

public class EmployeeService {
	// Using HashMap for fast search by ID
	private Map<Integer,  Employee> employeeMap = new HashMap<>();
	
	public void addEmployee(Employee emp) {
		employeeMap.put(emp.getId(), emp);
        System.out.println("Employee added successfully.");
	}
	
	public void updateEmployee(int id,String name,String departament,double salary) {
		Employee emp = employeeMap.get(id);
        if (emp != null) {
            emp.setName(name);
            emp.setDepartment(departament);
            emp.setSalary(salary);
            System.out.println("Employee updated successfully.");
        } else {
            System.out.println("Employee not found.");
        }
	}
	
	public void deleteEmployee(int id) {
        if (employeeMap.remove(id) != null) {
            System.out.println("Employee deleted successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }

    public void searchEmployee(int id) {
        Employee emp = employeeMap.get(id);
        if (emp != null) {
            System.out.println(emp);
        } else {
            System.out.println("Employee not found.");
        }
    }

    public void viewAllEmployees() {
        if (employeeMap.isEmpty()) {
            System.out.println("No employees available.");
        } else {
            for (Employee emp : employeeMap.values()) {
                System.out.println(emp);
            }
        }
    }
}
