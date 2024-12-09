package com;

import java.util.Scanner;

public class SmallBig {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of integers: ");
		int n=sc.nextInt();
		int small=Integer.MAX_VALUE;
		int big=Integer.MIN_VALUE;

		for(int i=1;i<=n;i++) {
			System.out.println("Enter integer "+i+":" );
			int num=sc.nextInt();
			if(num<small) {
				small=num;
			}
			if(num>big) {
				big=num;
			}
		}
		System.out.println("Biggest integer is : "+big);
		System.out.println("Smallest integer is : "+small);
	}
}
