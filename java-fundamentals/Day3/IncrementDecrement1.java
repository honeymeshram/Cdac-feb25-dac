/*
3. Write a program to print all multiples of 7 between 1 and 100. 
*/

public class IncrementDecrement1 { 
    public static void main(String[] args) { 
	
	int num=10;
	int result = num++ - ++num + --num + num--;
	System.out.println("the value result is :"+result);  //10-12+11+11=20
	System.out.println("the value num is :"+num);  //10        
    } 
 
 
}

/*  output
		The All Even Numbers between 1 and 50 are
		2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44 46 48 50*/
 
