package com.jala.java3;

import java.util.Scanner;

public class JavaBasicsPrimeNumb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner ss=new Scanner(System.in);
int a=Integer.parseInt(ss.nextLine());
int count=0;
if(a<2) {
	System.out.println("enter number above 2");
}
for(int i=2;i<a;i++) {
	if(a%i==0) {
		count++;
		
	}
}
if(count==0) {
	System.out.println(a+"is prime number");
}else {
	System.out.println(a+"is not prime number");
}
	}

}
