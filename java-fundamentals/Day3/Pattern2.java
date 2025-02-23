/*

19. Write a program to print the following pattern: 
1
1*2
1*2*3
1*2*3*4
1*2*3*4*5
*/

public class Pattern2 { 
    public static void main(String[] args) { 

	             
	for (int i =1; i <=5; i++) {             
		int count=0;
		for(int j=1;j<=i*2-1;j++){
			
			if(j%2==0){
				System.out.print("*");
			}else{
				count++;
				System.out.print(count);
			}			
		}
		System.out.println();	
        } 

        
    } 
 
 
}


/*  output
1
1*2
1*2*3
1*2*3*4
1*2*3*4*5
*/
