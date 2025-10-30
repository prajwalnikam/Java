package com.inheritance.check;

public class Child extends Parent{
	static {
		System.out.println("This is Child static");
	}
	
	{
		System.out.println("This is Child non static ");
	}
	
	public Child() {
		// TODO Auto-generated constructor stub
		System.out.println("This is Child constructor");
	}
}
