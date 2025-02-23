public class UninitializedWhileLoop { 
    public static void main(String[] args) { 
     //   int count;  // to use count variable first we have initialize the value of count
 

	int count=0;  //this is correv=ct
 
        while (count < 10) { 
            System.out.println(count); 
            count++; 
        } 
    } 
} 

/*
// Error to investigate: Why does this code produce a compilation error? What needs to be done to initialize the loop variable properly?

	 error: variable count might not have been initialized
        while (count < 10) {

	when we donot initialize the variable then it will not get the space in memory due to which it give us compile time error as variable might not have been initialized 

	To resolve this priblem we have to give inital value to count as ex. count=0 or 1 or something.

*/