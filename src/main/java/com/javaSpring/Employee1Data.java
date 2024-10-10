package com.javaSpring;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Employee1Data {

	public static void main(String[] args) {
		
		
        List<Employee1> employees = new ArrayList<>();
        employees.add(new Employee1("Employee1", "HR", 75000));
        employees.add(new Employee1("Employee1", "IT", 50000));
        employees.add(new Employee1("Employee1", "IT", 60000));
        employees.add(new Employee1("Employee1", "HR", 80000));
        employees.add(new Employee1("Employee1", "Finance", 70000));
        
        Map<String, List<Employee1>> groupedByDepartment = employees.stream()
                .collect(Collectors.groupingBy(employee -> employee.getDepartment()));
        
        groupedByDepartment.forEach((department,empList)->{
        	System.out.println("Department "+department);
        	
        	empList.forEach(employee->
        	
        		System.out.println("Name "+employee.getName()+" "+"Salary "+employee.getSalary())
        	);
            });

	}
	}
