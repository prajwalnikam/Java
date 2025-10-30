package com.sbi.register;
import java.util.Scanner;
public class Data {
	public static void main(String[] args) {
		Scanner s1 =new Scanner(System.in);
		System.out.println("Enter Employee Id: -");
		int id= s1.nextInt();
		System.out.println("Enter Employee Name: -");
		String name=s1.next();
		System.out.println("Enter Employee City: -");
		String city= s1.next();
		System.out.println("Enter Employee Salary: -");
		Float salary = s1.nextFloat();
		
		System.out.println("Employee Id: -"+id);
		System.out.println("Employee Name: -"+name);
		System.out.println("Employee City: -"+city);
		System.out.println("Employee Salary: -"+salary);
}
}
