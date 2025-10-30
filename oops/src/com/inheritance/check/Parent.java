package com.inheritance.check;

public class Parent {
	static {
		System.out.println("This is parent static");
	}
	
	{
		System.out.println("This is Parent non static ");
	}
	
	public Parent() {
		// TODO Auto-generated constructor stub
		System.out.println("This is Parent constructor");
	}
}
