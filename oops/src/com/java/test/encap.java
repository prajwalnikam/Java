package com.java.test;

import com.amazon.register.Admin;

public class encap {
	private int id;
	private String name;
	
	 public encap() {
		// TODO Auto-generated constructor stub
		System.out.println("comstrucotr");
	}
	
	{
		System.out.println("non static");
	}
	
	static {
		System.out.println("static");
	}
	
	static void data() {
		System.out.println("static method");
	}
	
	public void getid() {
		System.out.println("getter");
	}
	
	public void setid(int id) {
		System.out.println("setter");
		this.id=id;
	}
	public static void main(String[] args) {
		System.out.println("main method");
		encap e1=new encap();
		e1.setid(10);
		e1.getid();
	}
	
	//binding of all methods and all data like methods blocks and constructor in one single class that is call encapsulation.
	
}
