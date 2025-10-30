package com.loops.check;

public class odd {
	public static void main(String[] args) {
//		int count =0;
//		for (int i=1;i<=100;i++)
//		{
//			if(i%2==1)
//			{
//				System.out.println(i);
//				count++;
//			}
//		
//		}
//		System.out.println(count);
		
		for(int i= 2; i<=100;i++) {
			int count=0;
			for (int j=2;j<=i;j++) {
				if (i%j==0) {
					count ++;
				}
				
			}
			if (count<2) {
				System.out.println(i);
			}
		}
	}
}
