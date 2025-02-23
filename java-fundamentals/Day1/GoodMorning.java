/*
 Write a Java program that displays a "Good Morning" message if the 
predefined time is between 5 AM and 12 PM. Use an if statement to implement the logic.
*/

import java.util.Scanner;
/*
Write a Java program that displays a "Good Morning" message if the 
predefined time is between 5 AM and 12 PM. Use an if statement to implement the logic. 
*/

class GoodMorning{
	public static void main(String args[]){
		
	Scanner obj = new Scanner(System.in);
	System.out.println("Enter The Time");
       	int time=obj.nextInt();
	System.out.println("Enter 1 for AM OR 2 or anything  for PM");
	int num=obj.nextInt();

	String str;
	if(num==1){
		str="AM";	
	}else{
		str="PM";
	}

		
	
	
	if(time>=5&&time<=12&&str=="AM"){
		System.out.println("Good Morning");
	}
	

	}
}