public class LoopIncrement { 
    public static void main(String[] args) { 
        int count = 0;   //initial count  is 0
        for (int i = 0; i < 4; i++) {   // loop will run from 0 to 3
            count += i++ - ++i; 
        } 
        System.out.println(count); 
    } 
 
 
}

/* 
// Guess the output of this code snippet. 

		execution

	i    count=count+ i++ - ++i       i
	
	0    count=  0  + 0 - 2  = -2     2
	2    count= -2  + 2 - 4  = -4     4
	at i=4 condtion fail loop stopped

	so the value of count =-4

	output
	-4

*/
 
