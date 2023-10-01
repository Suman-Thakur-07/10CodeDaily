// 	Take two numbers as input and print the largest number.

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the First Number : ");
		int a = sc.nextInt();
		
		System.out.println("Enter the Second Number : ");
		int b = sc.nextInt();
		
		
		if(a>b) {
			System.out.println(a + " is the largest number");
		}else
		{
			System.out.println(b + " is the largest number");
		}

	}

}
