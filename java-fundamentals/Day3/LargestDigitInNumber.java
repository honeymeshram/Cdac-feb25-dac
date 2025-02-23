/*
9. Write a program to find and print the largest digit in the number 4825.  
*/

public class LargestDigitInNumber { 
    public static void main(String[] args) { 
	
	int num=4825;
       	int demo=num;
	int max=0;
	while(num>0){

		int res=num%10;
		if(max<res){
			max=res;
		}
		num=num/10;
	}   
	
	System.out.println("The largest Digit In A Number "+demo+" is :"+max);     
    } 
 
 
}

/*  output
	The largest Digit In A Number 4825 is :8	
*/
 
