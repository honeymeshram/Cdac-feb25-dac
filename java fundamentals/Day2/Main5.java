public class Main5{ 
    public static void main(String[] args) { 
       // int x = y + 10; //error y is not declared and defined/inititlize
	int y=5;
	int x=y+10;
        System.out.println(x); 
    } 
}

 /*

	 What error occurs? Why must variables be declared?

error: cannot find symbol
        int x = y + 10;
Variables should be declared because it tells the compiler the name, datatype, and memory space needed for that variable before it can be used in the program
*/