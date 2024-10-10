package com.javaSpring;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Employee2Sorted {

	 public static void main(String [] args)
	 {
		 List<Employee2> employees = new ArrayList<>();
	        employees.add(new Employee2("Employee1", 75000));
	        employees.add(new Employee2("Employee2", 50000));
	        employees.add(new Employee2("Employee3", 60000));
	        employees.add(new Employee2("Employee4", 80000));
 
	        List<Employee2> sortedEmployees = employees.stream()
	                .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
	                .toList();
	       

for (Employee2 employee : sortedEmployees) {
System.out.println("Name: " + employee.getName() + ", Salary: " + employee.getSalary());

	 }
	 }
}

