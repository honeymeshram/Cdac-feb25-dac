public class IncorrectLoopUpdate { 
    public static void main(String[] args) { 
        int i = 0; 
        while (i < 5) { 
            System.out.println(i); 
            i += 2; // Error: This may cause unexpected results in output 
        } 
    } 
} 

/*
// Error to investigate: What will be the output of this loop? How should the loop variable be updated to achieve the 
desired result? 


  There is no error on the code and program run successfully and the the variable is updating with +2 vlaue.
*/