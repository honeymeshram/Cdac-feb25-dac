public class Main4 { 
    public static void main(String[] args) { //this method be only called by jvm
        System.out.println("Main method with String[] args"); 
    } 
    public static void main(int[] args) { 
        System.out.println("Overloaded main method with int[] args"); 
    } 
} 

/*
	 Can you have multiple main methods? What do you observe?

we can have a multiple main method in java but with different parameters 
and the jvm only call String[]args parameter main method 
*/