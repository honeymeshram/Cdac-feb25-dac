public class Main18 { 
    public static void main(String[] args) { 
        int a = 10; 
        int b = 0; 
        // int result = a / b;  // Airthmetic Exception because no. divide by zero.

	int result =a/2;
        System.out.println(result); 
    } 
} 

/*
 What runtime exception is thrown? Why does division by zero cause an issue in Java?

	Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Main18.main(Main18.java:5)
	it cause an issue because it is a floating point value and divide by 0 will give infinite value (which is not a Number).
*/