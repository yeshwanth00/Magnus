package com.jaal.java2;

import java.util.Scanner;

public class JavaBasicsLogiicalAndOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ss=new Scanner(System.in);
		int a=Integer.parseInt(ss.nextLine());
		int b=Integer.parseInt(ss.nextLine());
		int c=Integer.parseInt(ss.nextLine());
		if(a>b && b>c) {
			System.out.println(a+"is greater number");
		}else if(a<b || b>c) {
			System.out.println(b+"is greater");
		}else {
			System.out.println(c+"is greater");
		}

	}

}
