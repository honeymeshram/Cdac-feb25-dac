public class MisplacedForLoopBody { 
    public static void main(String[] args) { 
       
	/*
//This will print done only one time because done statement did not reside int for body
	 for (int i = 0; i < 5; i++) 
            System.out.println(i); 
            System.out.println("Done"); 
	*/

	for (int i = 0; i < 5; i++) 
	// this is corrected code that have proper body and done statement reside in its
	{
            System.out.println(i); 
            System.out.println("Done"); 
	}

	
    } 
} 

/*
	//Error to investigate: Why does "Done" print only once, outside the loop? How should 	the loop body be enclosed to include all statements within the loop?


	Done only print only once because it is outside of the if we do not enclosed the 	body  with { and } then the for loop only takes statement next to it  as it parts 	of body rather than other  

	To print done multiple time and to reside it in to for memory we have to use {} 	brackets to specify its body. and reside done statement inside it.

*/