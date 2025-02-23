public class Main9 { 
	/* public  void display() {  method is not static or need to create object of class to call this method */

    public static void display() { 
        System.out.println("No parameters"); 
    } 

/* public  void display(int num) {  method is not static or need to create object of class to call this method */

    public static void display(int num) { 
        System.out.println("With parameter: " + num); 
    } 
    public static void main(String[] args) { 
	
       // display();   //not a static method cannot be referenced from static context
       // display(5);  //not a static method cannot be referenced from static context
	

	display();  //declared static so this is correct
	display(5); //declared static so this is correct


    } 
}

/*
 What happens when you compile and run this code? Is method overloading allowed? 

	 error: non-static method display() cannot be referenced from a static context
        display();
        ^
	 error: non-static method display(int) cannot be referenced from a static context
        display(5);

	Yes method overloading is allowed in java for that you must have different parameter 

*/