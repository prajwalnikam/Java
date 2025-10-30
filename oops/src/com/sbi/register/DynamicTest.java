package com.sbi.register;

import java.util.Scanner;

public class DynamicTest {
	public static void main(String[] args) {
		DynamicData dd = new DynamicData();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id");
		int id = sc.nextInt();
		System.out.println("enter name");
		String name = sc.next();
		System.out.println("enter city");
		String city = sc.next();
		
		dd.getData(id, name, city);
		dd.display();
	}
}
