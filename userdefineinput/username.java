package com.tnsif.userdefineinput;
import java.util.Scanner;

public class username {
	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		System.out.println("Enter the name:");
		String n=input.nextLine();
		System.err.println("Hello"+n);
		
		
		
		input.close();
		
	}
	}
	
