/*
6. Write a program to find and print the first 5 prime numbers. 
*/

public class FirstFivePrimeNumber { 
    public static void main(String[] args) { 

	System.out.println("The first 5 prime numbers are ");
        int count=0;
	for (int i =2; i <=20; i++) {             

		boolean prime = true;
		for(int j=2;j<i;j++){
			if(i%j==0){
				prime=false;
				break;
			}
		}
		if(prime){
			System.out.print(i+" ");
			count++;
		}
		if(count==5){
			break;
		}
		
        } 
        
    } 
 
 
}

/*  output
		The Multiples of 7 from 1 to 100 are
		7 14 21 28 35 42 49 56 63 70 77 84 91 98
*/
 
