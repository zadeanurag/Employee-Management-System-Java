package com.anurag.employee_management_system;

public class Employee {
	private int id;
	private String name;
	private String department;
	private double salary;
	
	public Employee(int id,String name,String department, double salary){
		this.id=id;
		this.name=name;
		this.department =department;
		this.salary=salary;
	}
	
	public int getId() {
		return id;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setDepartment(String department){
		this.department=department;
	}
	public void setSalary(double salary){
		this.salary=salary;
	}
	
	@Override
	public String toString(){
		return "ID :"+id+
			   " Name :"+name+
			   " Department :"+department+
			   "Salaray :"+salary;
	}
	
}
