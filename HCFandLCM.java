//  Find HCF and LCM of two numbers -



import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	System.out.println("Enter Number 1 : ");
	int num1 = sc.nextInt();
	
	System.out.println("Enter Number 2 : ");
	int num2 = sc.nextInt();
	
	int HCF = findHCF(num1, num2);
	int LCM = findLCM(num1, num2);
	
	
	System.out.println("HCF : " +HCF);
	System.out.println("LCM: " +LCM);
		
		}
	
	// Function to find the HCF (GCD) of two numbers using Euclidean Algorithm
	
	public static int findHCF(int num1,int num2) {
		if(num2 ==0) {
			return num1;
		}
		return findHCF(num2,num1%num2);
	}
	
	// Function to find the LCM
	public static int findLCM(int num1,int num2)
	{
		return (num1*num2)/ findHCF(num1,num2);
	}

}
