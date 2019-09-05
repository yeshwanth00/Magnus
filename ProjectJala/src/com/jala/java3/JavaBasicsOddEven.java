package com.jala.java3;

import java.util.Scanner;

public class JavaBasicsOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ss=new Scanner(System.in);
		int a=Integer.parseInt(ss.nextLine());
		if(a%2==0) {
			System.out.println(a+"is even number");
		}else {
			System.out.println(a+"is odd number");
		}

	}

}
