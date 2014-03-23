package com.vassilis.model;

public class Employee {
	private String name;
	private Integer emp_salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getEmp_salary() {
		return emp_salary;
	}
	public void setEmp_salary(Integer emp_salary) {
		this.emp_salary = emp_salary;
	}
	@Override
	public String toString() {
		return name + emp_salary;
	}
}
