package com.test;
import java.util.Scanner;
public class Maxminstr {
	public static void main(String[] args) {
	System.out.println("Enter the string:");
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	int max=-1;
	int min=-1;
	//String res;
	for(int i=0;i<str.length();i++) {
	if(min<str.charAt(i)) {
		min=str.charAt(i);
		System.out.println("min char:"+str.charAt(i));}
	}
	for(int i=0;i<str.length();i++) {
		if(max>str.charAt(i)) {
			max=str.charAt(i);
			System.out.println("max char:"+str.charAt(i));
		}
	}
	
	
	/*int[] f=new int[str.length()];
	char minchar=str.charAt(0),maxchar=str.charAt(0);
	int i,j,min,max;
	char string[]=str.tocharArry();
	for(i=0;i<string.length;i++)
		f[i]=1;
	for*/
	}
	}
