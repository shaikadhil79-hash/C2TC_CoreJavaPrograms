package Tutorial.java;

import java.util.Scanner;

public class userinput {
	public static void main(String args[])
	{
		Scanner name = new Scanner(System.in);
		//input integer from user
		int a = name.nextInt();	
		int b = name.nextInt();
		System.out.print(a+b);
		
		//input string from user
	    String c = name.nextLine();	
		String d = name.nextLine();		
		System.out.print(a+b);
		
	}
	

}
