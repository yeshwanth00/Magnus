package com.jala.java;

public class JavaBasics {
	public int cal() {
		int a=10;
		int b=20;
		int c=a+b;
		return c;
	}
	public void mess(String str,int i) {
		String word=str;
		int a=i;
		
		System.out.println(word+" "+a);
	}
	public void mess(int i,String str) {
		
	}

	public static void main(String[] args) {
		JavaBasics jb=new JavaBasics();
		int d=jb.cal();
		System.out.println(d);
		jb.mess("jala",2);
		jb.mess(2, "str");
		

	}

}
