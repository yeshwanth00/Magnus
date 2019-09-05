package com.jala.java3;

import java.util.Scanner;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

public class JavaBasicsLargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ss=new Scanner(System.in);
		System.out.println("enter 3 numbers");
		int a=Integer.parseInt(ss.nextLine());
		int b=Integer.parseInt(ss.nextLine());
		int c=Integer.parseInt(ss.nextLine());
		if(a>b && b>c) {
			System.out.println(a+"is largest number");
		}else if(b>a && b>c){
			System.out.println(b+"is largest number");
		}else {
			System.out.println(c+"is largest number");
		}
		

	}

}
