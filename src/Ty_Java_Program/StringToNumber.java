package Ty_Java_Program;

import java.util.Scanner;

public class StringToNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String s= sc.next();
		System.out.println(name(s));
		
	}
	public static int name(String s1) {
		 return s1.hashCode();
	}

}
