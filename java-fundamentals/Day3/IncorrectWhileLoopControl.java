public class IncorrectWhileLoopControl { 
    public static void main(String[] args) { 
        int num = 10; 

/*
        while (num = 10) {    
 //this will give compile time error as conditon boolean condition is expected 
            System.out.println(num); 
            num--; 
        } 

*/

	 while (num>0) {    
 //this will give compile time error as conditon boolean condition is expected 
            System.out.println(num); 
            num--; 
        } 

    } 
} 

/*
// Error to investigate: Why does the loop execute indefinitely? What is wrong with the loop condition? 

		 the loop will give compile time error because condition is expected to be boolean and there we are assigning value 10 to num so it is not a conditon and gives error


	to resolve this issue we have to change the conditon to num>0 then code will run successfullty
*/