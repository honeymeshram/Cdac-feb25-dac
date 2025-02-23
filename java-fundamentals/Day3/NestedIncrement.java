public class NestedIncrement { 
    public static void main(String[] args) { 
        int a = 10; 
        int b = 5; 
        int result = ++a * b-- - --a + b++; 
        System.out.println(result); 
    } 
} 
/*
// Guess the output of this code snippet

execution
         a=10  b=5;
	 ++a ->11  FIRST INCREMENT THEN ASSIGN   a=11 b=5
	 b-- ->5   FIRST ASSIGN THEN decrement   a=11 b=4
	 --a ->10   FIRST DECREMENT THEN ASSIGN  a=10 b=4
	 b++ ->4   FIRST ASSIGN THEN INCREMENT   a=10 b=5 

	so the value of result will be 11*5-10+4 = 49
	output
	49

*/