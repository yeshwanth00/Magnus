package com.jala.java3;

import java.util.Scanner;

public class JavaPolyn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner ss=new Scanner(System.in);
String word=ss.nextLine();
/*StringBuffer sb=new StringBuffer(word);
sb.reverse();
System.out.println(sb);
if(word.equals(sb.toString())) {
	System.out.println("given word is polyndrome");
}*/
char ch[]=word.toCharArray();
String s="";
for(int i=ch.length-1;i>=0;i--) {
	//System.out.print(ch[i]);
	s=s+ch[i];
}
System.out.println(s);
if(word.equals(s)) {
	System.out.println("enter word is polyn");
}
	}

}
