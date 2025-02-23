public class NestedLoopOutput { 
    public static void main(String[] args) { 
        for (int i = 1; i <= 3; i++) {        // i -> 1  2  3 4stop
            for (int j = 1; j <= 2; j++) {    // j -> 1  2  3stop 
                System.out.print(i + " " + j + " ");   //it will print on same line
            } 
            System.out.println();  //it will move cursor to nextline
 
 
        } 
    } 
} 

/*
// Guess the output of this nested loop.


       execution
 	i    j
	1    1 2
	2    1 2
	3    1 2 

	output
 	1 1 1 2
	2 1 2 2
	3 1 3 2
*/