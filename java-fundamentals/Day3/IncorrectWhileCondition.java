public class IncorrectWhileCondition { 
    public static void main(String[] args) { 
        int count = 5; 
       /* 
	 while (count = 0) {      //error will come as condition is not boolean
            System.out.println(count); 
            count--; 
        } 
	*/

	while (count > 0) {
 //this is error free code as we change the condition to boolean
            System.out.println(count); 
            count--; 
        } 
    } 
} 
/*

//Error to investigate: Why does the loop not execute as expected? What is the issue with the condition in the 
`while` loop? 

		error: incompatible types: int cannot be converted to boolean
        while (count = 0) {
	
	in while loop the condition is expected is boolean but it is written in int value
	so this is giving error  

	 

*/