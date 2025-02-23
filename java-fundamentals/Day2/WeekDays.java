/*
Write a program that uses a nested switch statement to print out the day of the week based on an 
integer input (1 for Monday, 2 for Tuesday, etc.). Additionally, within each day, print whether it 
is a weekday or weekend. 
*/

import java.util.Scanner;
class WeekDays{
	public static void main(String args[]){
		
		Scanner obj = new Scanner(System.in);

		System.out.println("Enter The Day Number between 1 and 7");	
		int num=obj.nextInt();
		
		switch(num){
		
			case 1:
				System.out.println("Day Is Monday");
				System.out.println("It Is A WeekDay");
				break;
		
			case 2:
				System.out.println("Day Is Tuesday");
				System.out.println("It Is A WeekDay");
				break;

			case 3:
				System.out.println("Day Is Wednesday");
				System.out.println("It Is A WeekDay");
				break;

			case 4:
				System.out.println("Day Is Thursday");
				System.out.println("It Is A WeekDay");
				break;
			
			case 5:
				System.out.println("Day Is Friday");
				System.out.println("It Is A WeekDay");
				break;
			
			case 6:
				System.out.println("Day Is Saturday");
				System.out.println("It Is A Weekend");
				break;

			
			case 7:
				System.out.println("Day Is Sunday");
				System.out.println("It Is A Weekend");
				break;

			default :
				System.out.println("Invalid Input");
				break;

			

		}
		

	}
}