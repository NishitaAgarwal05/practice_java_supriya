package com.javaSpring;

import java.util.Scanner;

public class Employee1 {

  private String name;
  private String department;
  private double salary;
  
public Employee1(String name, String department, double salary) {
	super();
	this.name = name;
	this.department = department;
	this.salary = salary;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDepartment() {
	return department;
}

public void setDepartment(String department) {
	this.department = department;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

		
}
