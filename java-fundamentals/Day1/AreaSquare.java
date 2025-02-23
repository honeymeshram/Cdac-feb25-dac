/*
 Write a Java program that calculates the area of a square using the formula 
area = side * side. Use a predefined side length. 
*/

import java.util.Scanner;
class AreaSquare{
	public static void main(String args[]){
		
	Scanner obj = new Scanner(System.in);
	System.out.println("Enter The Side of Square");	
	int side=obj.nextInt();

	double area=side*side;
	
	System.out.println("Area of Square is :"+area);
	

	}
}