public class Switch1 { 
    public static void main(String[] args) { 
        int number = 5; 
        switch(number) { 
            case 5: 
                System.out.println("Number is 5"); 
 
 
                break; 
/*      // both the labels are same to commenting one to run program successfully
            case 5: 
                System.out.println("This is another case 5"); 
                break; 
*/
            default: 
                System.out.println("This is the default case"); 
        } 
    } 
} 

/*
 Error to Investigate: Why does the compiler complain about duplicate case labels? What 
happens when you have two identical case labels in the same switch block?

 error: duplicate case label
            case 5:

	because both the cases label  are have same value so compiler is confused which to execute and hence gives error for duplicate case label

*/