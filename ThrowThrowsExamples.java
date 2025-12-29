package com.tnsif.exceptinghandling;
import java.util.Scanner;

public class ThrowThrowsExamples {
	
	static void checkage(int age)throws ArithmeticException{
		if(age < 18) {
			throw new ArithmeticException("Access denied _ "
					+ "you must be at least 18 years old");
			
		}else {
			System.out.println("Access granted - "
					+ "You are old enough!");
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int userAge = scanner.nextInt();
		try {
			checkage(userAge);
		}catch (ArithmeticException e) {
			System.out.println("Exception caught: "
					+ e.getMessage());
		}finally {
			System.out.println("progrsm completed.");
			scanner.close();
		}
		
		
	}

}
