public class Switch { 
    public static void main(String[] args) { 
        // double score = 85.0;   // double values cannot be used for switch
	 int score=85;  //it will work
        switch(score) { 
            case 100: 
                System.out.println("Perfect score!"); 
                break; 
            case 85: 
                System.out.println("Great job!"); 
                break; 
            default: 
                System.out.println("Keep trying!"); 
        } 
    } 
} 
/*
 Error to Investigate: Why does this code not compile? What does the error tell you about the 
types allowed in switch expressions? How can you modify the code to make it work? 

	 error: incompatible types: possible lossy conversion from double to int
        switch(score) {
              ^

	double values is not allowed in switch in java 

	we can use int place of double the code will work
*/
