package com.loops.check;

public class armstrong {
	public static void main(String[] args) {
		int n=153, sum=0;
		while (n>0) {
			int b=n%10;
			n/=10;
			sum+=b*b*b;	
		}
		System.out.println(sum);
	}
}
