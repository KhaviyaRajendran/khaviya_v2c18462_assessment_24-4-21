package com.test;
public class Xyz {
	public static boolean Rotation(String s1,String s2) {
		return ((s1.length()==s2.length())&&((s1+s1).indexOf(s2)!=-1));
	}
	public static void main(String[] args) {
		String s1="XYZ";
		String s2="YXZ";
		if(Rotation(s1,s2)) {
			System.out.println("Rotation of each other");
		}
			else {
				System.out.println("Not Rotation of each other");
			}
				
		}
	}


