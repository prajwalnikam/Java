package com.java.test;

public class DemoTest {
	private int id=10;
	private String name="Piks";
	private String city="Kop";
	private float salary=12345f;
	void sal(float salary) {
		this.salary=salary;
	}
	void salprint() {
		System.out.println("salary is"+this.salary);
	}
	
	void namesal(String name, float salary) {
		this.name=name;
		this.salary=salary;
	}
	void namesa() {
		System.out.println("name is "+this.name);
		System.out.println("salary is "+this.salary);
	}
	
	//jar asch combination krt rahilo 2 or 3 che tar n number of methods data get and display chya hotat so the solution will be in student.java
	
}
