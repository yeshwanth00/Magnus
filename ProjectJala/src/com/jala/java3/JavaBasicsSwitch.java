package com.jala.java3;

import java.util.Scanner;

public class JavaBasicsSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ss=new Scanner(System.in);
		int a=Integer.parseInt(ss.nextLine());
		char grade;
		switch(a) {
		case 1:
			if(a>75) {
				grade='A';
			}
			break;
		case 2:
			if(a>50 && a<75) {
				System.out.println("grade is B");
			}
			break;
			

	}

}}
