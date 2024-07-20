//package com.CollectionSet;

import java.util.Scanner;

public class Hackerrank6 {

    
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		int t = sc.nextInt();
		long n = sc.nextInt();
		long a = n;
		while(n!=0)
		{
			n=n/10;
			count = count+1;
		}
		
		try {
			for(int i=0;i<t;i++) {

				if(count>=1 && count<=2)
				{
					System.out.println(a + " can be fitted in:");
					System.out.println("* byte");
				}
				else if(count>=3 && count<=5) {
					System.out.println(a + " can be fitted in:");
					System.out.println("* short");
					System.out.println("* int");
					System.out.println("* long");
				}
				else if(count>=6 && count<=10) {
					System.out.println(a + " can be fitted in:");
					System.out.println("* int");
					System.out.println("* long");
				}
				else if(count>=11 && count<=19) {
					System.out.println(a + " can be fitted in:");
					System.out.println("* long");
				}
			}
		}
		catch(Exception e) {
			System.out.println( n + " can't be fitted anywhere.");
		}
		
		
			
		
		
		
	}
	
}
