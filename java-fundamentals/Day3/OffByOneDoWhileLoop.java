public class OffByOneDoWhileLoop { 
    public static void main(String[] args) { 
        int num = 1; 
/*
        do {                //this loop will run for 1 time according to given snippet
            System.out.println(num); 
            num--;    //num become 0
        } while (num > 0); 

*/

	
	  do { 
            System.out.println(num); 
            num++;
	// here num get incrementted everytime the loop get executed according to condition
        } while (num <=5);  //condition change to num<=5 to run the loop for 1 to 5 times


    } 
} 

/*
// Error to investigate: Why does this loop print unexpected numbers? What adjustments are needed to print the 
numbers from 1 to 5?


		the loop will run for 1 time only according to code as num is decrementing in do body and becode zero then when condition will check on while so num become zero and zero >zero became flase and loop will get terminated .

	to print the number from 1 to 5 we have to increment the num in do body and change the while condition to num<=5 .
*/