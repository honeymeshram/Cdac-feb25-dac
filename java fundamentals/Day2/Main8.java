public class Main8 {   
    public static void main(String[] args) { 
    //int class = 10;  keyword cannot be used as the variable name
    int $class = 10;   
      //   System.out.println(class);  //keyword cannot be used as the variable name

 System.out.println($class); 

    } 
} 
/*
 What error occurs? Why can't reserved keywords be used as identifiers? 

error: <identifier> expected
        int class = 10;

error: illegal start of type
        System.out.println(class);

 error: <identifier> expected
        System.out.println(class);

 	Reserved keywords  cannot be used as  identifiers because the keywords have predefined meaning within the language syntax .if the identifier has same name as keywords the compiler will get confused and will give the unexpected results
*/

