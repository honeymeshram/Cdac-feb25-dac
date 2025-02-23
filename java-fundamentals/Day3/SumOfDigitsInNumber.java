/*
7. Write a program to calculate the sum of the digits of the number 9876. The output should be 
30 (9 + 8 + 7 + 6).  
*/

public class SumOfDigitsInNumber { 
    public static void main(String[] args) { 
	
	int num=9876;
        int sum=0;
	int demo=num;
	while(num>0){

		sum+=num%10;
		num=num/10;
	}   
	
	System.out.println("The Sum Of Digits In A Number "+demo+" is :"+sum);     
    } 
 
 
}

/*  output
	The Sum Of Digits In A Number 9876 is :30	
*/
 
