package com.inheritance.check;

public class Test {

	static {
		System.out.println("this is main static");
	}
	
	public static void main(String[] args) {
		
		GrandChild g1 = new GrandChild();
		Child c1 = new Child();
	}
}
