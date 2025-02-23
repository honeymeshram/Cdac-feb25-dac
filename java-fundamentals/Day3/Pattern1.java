/*

13. Write a program to print the following pattern: 
1 
2*2 
3*3*3 
4*4*4*4 
5*5*5*5*5 
5*5*5*5*5 
4*4*4*4 
3*3*3 
2*2 
1
*/

public class Pattern1 { 
    public static void main(String[] args) { 

	             
	for (int i =1; i <=5; i++) {             
		
		for(int j=1;j<=i*2-1;j++){
		
			if(j%2==0){
				System.out.print("*");
			}else{
				System.out.print(i);
			}			
		}
		System.out.println();	
        } 

	for (int i =5; i >=1; i--) {             
		
		for(int j=i*2-1;j>=1;j--){
		
			if(j%2==0){
				System.out.print("*");
			}else{
				System.out.print(i);
			}			
		}
		System.out.println();	
        } 

        
    } 
 
 
}


/*  output
1
2*2
3*3*3
4*4*4*4
5*5*5*5*5
5*5*5*5*5
4*4*4*4
3*3*3
2*2
1
*/
