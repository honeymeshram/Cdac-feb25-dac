/*
Question 4: Discount Calculation  
Write a program to calculate the discount based on the total purchase amount. Use the following 
criteria: 
 If the total purchase is greater than or equal to Rs.1000, apply a 20% discount. 
 If the total purchase is between Rs.500 and Rs.999, apply a 10% discount. 
 If the total purchase is less than Rs.500, apply a 5% discount. 
Additionally, if the user has a membership card, increase the discount by 5%.

*/	

import java.util.Scanner;
class DiscountCalculation{
	
	public static void main(String args[]){

	 	 Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the total purchase amount");
		int amount=obj.nextInt();
		
		System.out.println("Is user has a membership press 1 for yes 2 for no.");
		int press=obj.nextInt();
		
		int discount=0;
		if(amount>=1000){
			
			discount= (amount*20)/100;
		}else if(amount>=500&&amount<=999){
			discount=(amount*10)/100;
		}else if(amount<500){
			discount=(amount*5)/100;
		}

		if(press==1){
		
			discount=((amount*5)/100)+discount;
		}

		System.out.println("You get A Discount of :"+discount+" Rupees On Your Purchase.");

	
	
	}


}