package com.test;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class Fileread {
	public static void main(String[] args) {
		try {
		FileWriter mywriter=new FileWriter("filename.txt");
		mywriter.write("java language training");
		mywriter.close();
				
		System.out.println("successfully wrote");}
		catch(Exception e){
			System.out.println("error");
			e.printStackTrace();
		}
		
		try {
			File obj=new File("C:\\Users\\Khaviya.R\\ecpbackup\\eclipse-workspace\\com.test\\src\\com\\test");
			Scanner myreader=new Scanner(obj);
			while(myreader.hasNextLine());
			String data=myreader.nextLine();
			System.out.println(data);
		}
		catch(Exception e) {
			System.out.println("error");
			e.printStackTrace();
		}
	}
}
