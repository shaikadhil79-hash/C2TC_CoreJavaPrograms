package com.tnsif.exceptinghandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlock {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Emter the number : ");
			int number = scanner.nextInt();
			System.out.println(number %2 == 0 ? number
					+ "is Even" : number +  "is odd");
			return;
		}catch(InputMismatchException e) {
			System.err.println("Inva"
					+ "lid input...");
		}finally{
			System.out.println("In finally...");
			scanner.close();
			
		}
	}

}
