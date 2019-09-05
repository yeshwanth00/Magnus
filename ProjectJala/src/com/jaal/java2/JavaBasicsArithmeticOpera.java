package com.jaal.java2;

import java.util.Scanner;

public class JavaBasicsArithmeticOpera {
static Scanner ss=new Scanner(System.in);

public static int a;
public static int b;
public static void accept() {
	System.out.println("enter two numbers");
	a=Integer.parseInt(ss.nextLine());
	b=Integer.parseInt(ss.nextLine());
	
	
	
}
public static int additn() {
	int c= a+b;
	return c;
}
public static int subtrtn() {
	int c=a-b;
	return c;
}
public static double multy() {
	double c=a*b;
	return c;
}
public static double divisn() {
	double c=a/b;
	return c;
}
public static double modulus() {
	double c=a%b;
	return c;
}
	public static void main(String[] args) {
		JavaBasicsArithmeticOpera.accept();
		System.out.println(JavaBasicsArithmeticOpera.additn());
		System.out.println(JavaBasicsArithmeticOpera.subtrtn());
		System.out.println(JavaBasicsArithmeticOpera.multy());
		System.out.println(JavaBasicsArithmeticOpera.divisn());
		System.out.println(JavaBasicsArithmeticOpera.modulus());
		
	}
		

}
