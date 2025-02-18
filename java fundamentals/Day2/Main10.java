public class Main10 { 
    public static void main(String[] args) { 
        int[] arr = {1, 2, 3}; 

        //System.out.println(arr[5]); //array out of bound for length 3
	
	System.out.println(arr[2]);
 
    } 
}


/*
What runtime exception do you encounter? Why does it occur? 

Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3

It occur because we are trying to accessing element arr[5] which is not present because array has only size 3 so we can access only upto arr[2] and arr[5] is out of bound.
*/