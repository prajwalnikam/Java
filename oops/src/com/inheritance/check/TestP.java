package com.inheritance.check;

public class TestP {

	public static void main(String[] args) {
		
	
	Pattern p1 = Pattern.data();
	Pattern p2 = Pattern.data();
	Pattern d2 = Pattern.demo();
	Pattern d3 = Pattern.demo();
	System.out.println(p1.hashCode());
	System.out.println(p2.hashCode());//single ton design pattern
	
	System.out.println(d2.hashCode());
	System.out.println(d3.hashCode());//single ton design pattern breaks if statement is not used in demo
	}
}
