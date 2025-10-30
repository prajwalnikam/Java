package com.inheritance.check;

public class Pattern {

	public static Pattern p1=new Pattern();//eager initialization
	public static Pattern d2=null;
	private Pattern()
	{
		System.out.println("this is constructor");
	}
	
	public static Pattern data() {
		if (p1==null) {
			p1 = new Pattern();//single ton design pattern
			
		}
		return p1;
	}
	
	public static Pattern demo() {
	
		d2=new Pattern();//lazy initialization of object 
		return d2;//single ton design pattern breaks if statement is not used in demo
	}
}
