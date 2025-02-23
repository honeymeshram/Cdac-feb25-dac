/*

20. Write a program to print the following pattern: 
5
5*4
5*4*3
5*4*3*2
5*4*3*2*1
*/

public class Pattern3 { 
    public static void main(String[] args) { 

	             
	for (int i =1; i <=5; i++) {             
		int count=5;
		for(int j=1;j<=i*2-1;j++){
			
			if(j%2==0){
				System.out.print("*");
			}else{
				
				System.out.print(count);
				count--;
			}			
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
