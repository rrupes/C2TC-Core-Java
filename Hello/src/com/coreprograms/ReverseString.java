package com.coreprograms;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter string to Reverse ");
		String str=s.next();
		String reverse="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}
		System.out.println(reverse);
	}

}
