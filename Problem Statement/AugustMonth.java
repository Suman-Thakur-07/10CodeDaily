

//	Suman is allowed to go out with his friends only on the even days of a  
//given month. Write a program to count the number of days he
//can go out in the month of August.


import java.util.Scanner;

public class Suman {

	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);
		int count =0;
		
		
		for(int i=0;i<=31;i++) {
			
			if(i%2==0) {
				count++;
			}
			
		}
		
		System.out.println("In the month of August he can go for " + count);
		
		
	}

}
