package com.amazon.register;

public class Teacher {
	int id;
	String name;
	float salary;
	
	void display() {
		
		this.id=1000;
		this.name="Niks";
		this.salary=900;
		
		System.out.println("Teacher id:- "+this.id);
		System.out.println("Teacher name:- "+this.name);
		System.out.println("Teacher salary:- "+this.salary);
	}

}
