public class Main11 { 
    public static void main(String[] args) { 
     
  /*
   while (true) {                     // it will go to infinite loop 
            System.out.println("Infinite Loop"); 
        } 
 */	
	int x=10;
	   while (x>=5) {   
            System.out.println("value :"+x); 
		x--;
        } 

    } 
} 

/*
	 What happens when you run this code? How can you avoid infinite loops?
	
	The Code will run for an infite time printing infinite loop
	To avoid infinite loop we have to write the right condtion so that the loop didnt 	run for infinite times	
*/