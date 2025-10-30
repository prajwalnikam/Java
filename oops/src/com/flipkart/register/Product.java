package com.flipkart.register;

public class Product {
	int id,pincode;
	String name,city,dept,address;
	float salary,income;
	void getData(int id,String name,String city,String dept,String address,float salary,float income,int pincode) {
		this.id=id;
		this.name=name;
		this.city=city;
		this.dept=dept;
		this.address=address;
		this.salary=salary;
		this.income=income;
		this.pincode=pincode;
		
		System.out.println(this.id);
		System.out.println(this.name);
		System.out.println(this.city);
		System.out.println(this.dept);
		System.out.println(this.address);
		System.out.println(this.salary);
		System.out.println(this.income);
		System.out.println(this.pincode);
		
	}
}
