public class Main12 { 
    public static void main(String[] args) { 
       // String str = null;  // holds nothing

	 String str = "Tushar"; 
        System.out.println(str.length()); 
    } 
} 

/* 

 What exception is thrown? Why does it occur? 


Exception in thread "main" java.lang.NullPointerException
        at Main12.main(Main12.java:4)

It is occur because there is no actual object that String str hold.

*/