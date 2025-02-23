public class DoWhileLoop { 
    public static void main(String[] args) { 
        int i = 1;  //initial value of i=1
        do { 
            System.out.print(i + " ");  //print val of i
            i++;  //increment i by 1
        } while (i < 5);  //check condition
        System.out.println(i);  //at last print i
    } 
} 

/*
// Guess the output of this do-while loop

		execution
	i	print->i       i++     i<5
	1       print->1        2      true
	2       print->2        3      true
	3       print->3        4      true
        4       print->4        5      false
        Loop execution stop

       at last output i=5 printed


		output
		1 2 3 4 5
                space line
		
	
*/