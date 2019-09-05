package com.jala.java;

import java.util.Scanner;

public class JavaBasicsFunction {
	public String call() {
		Scanner ss=new Scanner(System.in);
		System.out.println("enter your name");
		String name=ss.nextLine();
		return name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaBasicsFunction jb=new JavaBasicsFunction();
		System.out.println(jb.call());

	}

}
