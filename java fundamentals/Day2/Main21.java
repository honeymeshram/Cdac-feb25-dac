public class Main21 { 
    public static void main(String[] args) { 
        /* static void displayMessage() {   //method inside another  method  gives error
            System.out.println("Message"); 
        } */
    } 
} 
/*
 What syntax error occurs? Can a method be declared inside another method?
	error: illegal start of expression
        static void displayMessage() {
        ^
	Main21.java:7: error: class, interface, or enum expected
	}
	
	in java we cannot directly nested method in another method but we can nest a class 	in method and then the class have as many method to be nested according to 	requirement.
	
*/