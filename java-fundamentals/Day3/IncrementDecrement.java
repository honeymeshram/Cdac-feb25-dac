public class IncrementDecrement { 
    public static void main(String[] args) { 
        int x = 5; 
        int y = ++x - x-- + --x + x++; 
        System.out.println(y); 
    } 
} 

/*
// Guess the output of this code snippet.


	execution
         X=5;
	 ++x ->6   FIRST INCREMENT THEN ASSIGN   X=6
	 x-- ->6   FIRST ASSIGN THEN INCREMENT   X=5
	 --x ->4   FIRST DECREMENT THEN ASSIGN   X=4
	 x++ ->4   FIRST ASSIGN THEN INCREMENT   X=5  

	so the value of y will be 6-6+4+4 = 8

	output
	8 

*/  
         