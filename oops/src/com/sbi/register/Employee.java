package com.sbi.register;

import java.util.Scanner;

public class Employee {
	int id;
	String name;
	String city;
	float salary;
	void getData()
	{
		Scanner s1 =new Scanner(System.in);
		System.out.println("Enter Employee Id: -");
		this.id= s1.nextInt();
		System.out.println("Enter Employee Name: -");
		this.name=s1.next();
		System.out.println("Enter Employee City: -");
		this.city= s1.next();
		System.out.println("Enter Employee Salary: -");
		this.salary = s1.nextFloat();
	}
	
	void display() {
		
		System.out.println("Employee Id: -"+this.id);
		System.out.println("Employee Name: -"+this.name);
		System.out.println("Employee City: -"+this.city);
		System.out.println("Employee Salary: -"+this.salary);
	}
}
