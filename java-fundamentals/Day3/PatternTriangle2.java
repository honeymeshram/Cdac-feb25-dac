/*
17. Write a program to print the following pattern: 
 * * * * * 
  * * * * 
   * * * 
    * * 
     * 
*/

public class PatternTriangle2{ 
    public static void main(String[] args) { 

	             
	for (int i =5; i >=1; i--) {             
		
		for(int j=1;j<=5-i;j++){
			System.out.print(" ");
						
		}

		for(int k=1;k<=i;k++){
		
			System.out.print("* ");
			
		}
		
	
		System.out.println();	
        } 

        
    } 
 
 
}


/*  output
 
* * * * *
 * * * *
  * * *
   * *
    *

*/
