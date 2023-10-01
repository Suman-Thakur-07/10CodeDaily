
//Volume of Cylinder/sphere
//volume of a sphere is 4⁄3πr³
//Volume of cylinder is πr²h

import java.util.Scanner;

public class Person {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose to calculate your volume");
		System.out.println("1.Sphere");
		System.out.println("2.Cylinder");
		int choice =sc.nextInt();
		
		switch (choice){
			case 1:
			
		    System.out.println("Enter the radius : ");
			Double r1 = sc.nextDouble();
			Double vol1 =VolofSphere(r1);
			System.out.println("Volume of Sphere = " +vol1);
			
			case 2:
				
				System.out.println("Enter the radius : ");
				Double r2 = sc.nextDouble();
				System.out.println("Enter the height : ");
				Double h = sc.nextDouble();
				Double vol2 =VolofCylinder(r2,h);
				System.out.println("Volume of Cylinder = " +vol2);
			
			
			
			default:
				System.out.println("Invalid choice");
			
		}
		
		

		    sc.close();
		
		
		
		
	}
	
	public static double VolofSphere(double r1) {
		
		double pi =Math.PI;
		double sphere = 4/3*pi*Math.pow(r1, 3);
		
		return sphere;
	}
	
	public static double VolofCylinder(double r2,double h) {
		double pi =Math.PI;
		double cylinder = Math.PI * Math.pow(r2, 2) *h;
		return cylinder;
				
	}

}
