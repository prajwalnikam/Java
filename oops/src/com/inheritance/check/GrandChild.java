package com.inheritance.check;

public class GrandChild extends Child {
	
	static {
		System.out.println("This is Grand Child static");
	}
	
	{
		System.out.println("This is Grand Child non static ");
	}
	
	public GrandChild() {
		// TODO Auto-generated constructor stub
		System.out.println("This is Grand Child constructor");
	}
}
