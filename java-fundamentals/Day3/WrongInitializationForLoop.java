public class WrongInitializationForLoop { 
    public static void main(String[] args) { 
      
	/*
	  for (int i = 10; i >= 0; i++) {
	 //it will run for infinite times i is always > than 0
            System.out.println(i); 
        }
	*/

	 for (int i = 10; i >= 0; i--) { //it will run for finite times 

            System.out.println(i); 
        } 

    } 
} 
/*
 //Error to investigate: Why does this loop not print numbers in the expected order? What is the problem with the initialization and update statements in the `for` loop?


	the loop will run infinite times because the value of i=10 and i>=0 and it is 	always 	getting incremented so run for infinite time

		
	To resolve this issue we have change the increment conditon i++ to decrement i-- 
	to run the loop for finite time and get the expected output.

*/