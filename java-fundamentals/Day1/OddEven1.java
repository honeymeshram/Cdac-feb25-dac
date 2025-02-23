/*
: Write a Java program that checks if a predefined number is odd or even. Use 
an if-else statement and the modulus operator (%) to determine whether the number is 
divisible by 2 or not.
*/

import java.util.Scanner;
class OddEven1{
	public static void main(String args[]){
		
	Scanner obj = new Scanner(System.in);
	System.out.println("Enter The Number");	
	int num=obj.nextInt();
	
	if(num%2==0){
		System.out.println("Number is Even :"+num);
	}else{
		System.out.println("Number is Odd :"+num);
	}

	

	}
}