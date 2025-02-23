public class DoWhileIncorrectCondition { 
    public static void main(String[] args) { 
        int num = 0; 
        do { 
            System.out.println(num); 
            num--; 
        } while (num > 0); 
 
 
    } 
} 
/*
 //Error to investigate: Why does the loop only execute once? What is wrong with the loop condition in the `dowhile` loop?

	Here the loop will execute infinite time because num is always greater than zero
	and num is incremented again and again 

	to resolve this conditon we have to decrement the num like n--  and change the condition to (num>0) so that the loop will execute at least once.
	


*/