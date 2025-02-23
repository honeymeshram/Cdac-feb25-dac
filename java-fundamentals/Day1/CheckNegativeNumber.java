/*
 Write a Java program that checks if a predefined number is negative using an 
if-else statement and prints the appropriate message.
*/

import java.util.Scanner;
class CheckNegativeNumber{
	public static void main(String args[]){
		
	Scanner obj = new Scanner(System.in);
	System.out.println("Enter The Number");	
	int num=obj.nextInt();
	
	if(num<0){
		System.out.println("Number is Negative");
	}else{
		System.out.println("Number is Not Negative");
	}

	

	}
}