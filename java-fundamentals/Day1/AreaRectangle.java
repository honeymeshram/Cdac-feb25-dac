/*
  Write a Java program that calculates the area of a rectangle using the formula 
area = length * width. Use predefined values for length and width
*/

import java.util.Scanner;
class AreaRectangle{
	public static void main(String args[]){
		
	Scanner obj = new Scanner(System.in);

	System.out.println("Enter The Length of Rectangle");	
	int length=obj.nextInt();
	
	System.out.println("Enter The Width of Rectangle");	
	int width=obj.nextInt();

	double area=length*width;
	
	System.out.println("Area of Rectangle is :"+area);
	

	}
}