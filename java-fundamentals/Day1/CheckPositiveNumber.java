/*
 Write a Java program that checks if a predefined number is positive using an 
if-else statement and prints the appropriate message.
*/

import java.util.Scanner;
class CheckPositiveNumber{
	public static void main(String args[]){
		
	Scanner obj = new Scanner(System.in);
	System.out.println("Enter The Number");	
	int num=obj.nextInt();
	
		if(num>0){
			System.out.println("Number is Positive");
		}else{
			System.out.println("Number is Not Positive");
		}

	

	}
}