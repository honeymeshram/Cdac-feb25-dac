/*

19. Write a program to print the following pattern: 
5
5*4
5*4*3
5*4*3*2
5*4*3*2*1
*/

public class Pattern6 { 
    public static void main(String[] args) { 

	             
	for (int i =1; i <=5; i++) {             
		
		for(int j=1;j<=i;j++){
			
			System.out.print(i);	
					
		}
		System.out.println();	
        } 

        
    } 
 
 
}


/*  output
5
5*4
5*4*3
5*4*3*2
5*4*3*2*1
*/
