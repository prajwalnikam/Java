package com.sbi.register;

public class DynamicData {

	int id;
	String name,city;
	void getData(int a, String b, String c)
	{
		this.id=a;
		this.name=b;
		this.city=c;
	}
	
	void display() {
		System.out.println(this.id);
		System.out.println(this.name);
		System.out.println(this.city);
	}
}
