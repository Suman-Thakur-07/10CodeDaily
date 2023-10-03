

import java.util.Scanner;

// 	Reverse a String in java.

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String original  = "Hello World";
		String Rev = "";
		
		// using for loop
		for(int i =original.length()-1;i>=0;i--) {
			Rev += original.charAt(i);
			
		}
		
		 System.out.println("Original: " + original);
	        System.out.println("Reversed: " + Rev);
		
	}

	

}
