package java_Program_to_calculate_area_of_Triangle;

/**
 * @author: BeginnersBook.com
 * @description: Program to Calculate area of Triangle in Java
 * with user interaction. Program will prompt user to enter the 
 * base width and height of the triangle.
 */

import java.util.Scanner;
public class AreaTriangleDemo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the width of the Triangle: ");
		double base = scanner.nextDouble();
		
		System.out.println("Enter the hight of the Triangle: ");
		double hight = scanner.nextDouble();
		
		scanner.close();
		
		//Area = (base*height)/2
		double Area = (base * hight)/2;
		
		System.out.println("Area of the triangle = " + Area);
		

	}

}
