public class LoopVariableScope { 
    public static void main(String[] args) { 
        
/*  //error 
	for (int i = 0; i < 5; i++) { 
            int x = i * 2;    // i variable is define and declare in for loop body.
        } 
        System.out.println(x); // Error: 'x' is not accessible here 

*/
                int x=0;    //code is corrected
		 for (int i = 0; i < 5; i++) { 
           x = i * 2; 
        } 
        System.out.println(x); // Error: 'x' is not accessible here 

    } 
} 

/*
// Error to investigate: Why does the variable 'x' cause a compilation error? How does scope 

	x is causing compile time error because x is define and declared in for loop body and we are printing it outside of its scope so code is giving error

	to resolve it we should define and declare it in main function.

*/