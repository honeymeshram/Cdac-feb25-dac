/*

21. Write a program to print the following pattern: 
1
1*3
1*3*5
1*3*5*7
1*3*5*7*9
*/

public class Pattern5 { 
    public static void main(String[] args) { 

	             
	for (int i =1; i <=5; i++) {             
		
		for(int j=1;j<=i*2-1;j++){
			
			if(j%2==0){
				System.out.print("*");
			}else{
				
				System.out.print(j);
			}			
		}
		System.out.println();	
        } 

        
    } 
 
 
}


/*  output
1
1*3
1*3*5
1*3*5*7
1*3*5*7*9
*/
