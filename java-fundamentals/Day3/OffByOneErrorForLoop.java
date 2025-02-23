public class OffByOneErrorForLoop { 
    public static void main(String[] args) { 

/*
        for (int i = 1; i <= 10; i++) { //it will print 1 to 10 and loop will fail at 11
            System.out.println(i); 
        } 
        // Expected: 10 iterations with numbers 1 to 10 
        // Actual: Prints numbers 1 to 10, but the task expected only 1 to 9 
*/
	
	for (int i = 1; i < 10; i++) { 
/* we change the condition to i<10 so now loop will run form 1 ot 9 and at when i=10 conditon fails so we get the expected output
*/
            System.out.println(i); 
        } 

    } 
} 
/*
 Error to investigate: What is the issue with the loop boundaries? How should the loop be adjusted to meet the expected output?

		the loop will print 1 to 10 as its condition is (i<=10) when i will 11 the 		conditon fails 

		To run loop from 1 to 9 we have the change the condition to i<10
		and get the expected output
*/