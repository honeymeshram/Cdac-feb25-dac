/*
Question 3: Calculator  
Write a program that acts as a simple calculator. It should accept two numbers and an operator 
(+, -, *, /) as input. Use a switch statement to perform the appropriate operation. Use nested if
else to check if division by zero is attempted and display an error message. 
*/

import java.util.Scanner;
class Calculator{
	public static void main(String args[]){
		
		Scanner obj = new Scanner(System.in);

		System.out.println("Enter The 1st  Number");	
		int num1=obj.nextInt();
			
		System.out.println("Enter The 2st  Number");	
		int num2=obj.nextInt();

		System.out.println("Enter The Operations to be Performed like (+, -, *, /) ");
		char ch=obj.next().charAt(0);
	
				

		
		switch(ch){
		
			case '+':
				
				System.out.println("The Sum is :"+(num1+num2));
				break;
		
			case '-':
				System.out.println("The Substraction is :"+(num1-num2));
				break;


			case '*':
				System.out.println("The Multiplication is :"+(num1*num2));
				break;


			case '/':
				if(num2==0){
					System.out.println("Cannot divide by 0  ");
				

				}else{
					System.out.println("The Division is :"+(num1/num2));
				
				}
				break;
			
			
			default :
				System.out.println("Invalid Operator Selection");
				break;

			

		}
		

	}
}