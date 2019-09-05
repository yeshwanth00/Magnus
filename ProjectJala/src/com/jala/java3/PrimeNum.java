package com.jala.java3;

import java.util.Scanner;

public  class PrimeNum {
	
	public static boolean getPrime(int a) {
		if(a<2) {
			return false;
		}
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				return false;
			}
		}
		return true;
	
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ss=new Scanner(System.in);
		System.out.println("enter two numbers ");
		int a=Integer.parseInt(ss.nextLine());
		int b=Integer.parseInt(ss.nextLine());
		for(int i=a;i<=b;i++) {
		boolean c=PrimeNum.getPrime(i);
		if(c==true) {
			System.out.print(i+" ");
		}
			
		}
		

	}

}
