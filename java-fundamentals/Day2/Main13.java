public class Main13 { 
    public static void main(String[] args) { 
      //  double num = "Hello";  //string cannot be converted to double

	double num=1055520222;
        System.out.println(num); 
    } 
} 

/*
	 What compilation error occurs? Why does Java enforce data type constraints? 

	error: incompatible types: String cannot be converted to double
        double num = "Hello";
	java enforces type constraints to improve code readibility and catch type related 	errors at compile time .
*/