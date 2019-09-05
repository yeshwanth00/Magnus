package com.jala.java3;

import java.util.Scanner;

public class JavaBasicsPolybdrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ss=new Scanner(System.in);
		System.out.println("enter a number");
		int sum=Integer.parseInt(ss.nextLine());
		int rev=0;
		int num;
		num=sum;
		while(0<num) {
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
		if(rev==sum) {
			System.out.println("the given num is polybdrome");
		}

	}

}
