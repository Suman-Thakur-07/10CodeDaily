

import java.util.Scanner;

// Calculate Fibonacci Series up to n numbers.

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter N number : ");
		int N =sc.nextInt();
		
	
		long[] fibonacciSeries = new long[N];
		
		
		// First two fibonacci Series
		fibonacciSeries[0] = 0;
		if(N>1) {
			fibonacciSeries[1]=1;
		}
		
		
		// Generating the rest series
		for(int i=2;i<N;i++) {
			
			fibonacciSeries[i] = fibonacciSeries[i-1]+fibonacciSeries[i-2];
		}
		
		
		//Displaying the series
		for(int i=0; i<N;i++) {
			System.out.println(fibonacciSeries[i]+ " ");
		}
		sc.close();
		
	}

}
