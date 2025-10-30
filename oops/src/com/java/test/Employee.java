package com.java.test;

public class Employee {
	private int id=10;
	private String name="Piks";
	private String city="Kop";
	private float salary=12345f;
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.id =50;
		e1.name="Niks";
		e1.city = "Pune";
		e1.salary=21212f;
		System.out.println("Id is "+e1.id);
		System.out.println("name is "+e1.name);
		System.out.println("city is "+e1.city);
		System.out.println("Salary is "+e1.salary);
	}
}
