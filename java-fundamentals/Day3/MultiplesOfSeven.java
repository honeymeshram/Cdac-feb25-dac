/*
3. Write a program to print all multiples of 7 between 1 and 100. 
*/

public class MultiplesOfSeven { 
    public static void main(String[] args) { 

	System.out.println("The Multiples of 7 from 1 to 100 are ");
             
	for (int i =1; i <=100; i++) {             
		
		if(i%7==0){
		
			System.out.print(i+" "); 

		}
        } 
        
    } 
 
 
}

/*  output
		The Multiples of 7 from 1 to 100 are
		7 14 21 28 35 42 49 56 63 70 77 84 91 98
*/
 
