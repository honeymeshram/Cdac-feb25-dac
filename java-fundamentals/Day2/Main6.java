public class Main6 { 
    public static void main(String[] args) { 
      //  int x = "Hello";  //error string cannot be converted to int
String x="Hello";
        System.out.println(x); 
    } 
}
/*  
	 What compilation error do you see? Why does Java enforce type safety?


	error: incompatible types: String cannot be converted to int
        int x = "Hello";
    java enforce type safety because when the bigger datatype variable  of same type value  will assigned to small datatype it will be out of its range and give runtime error
and 
when different datatype variable value assiged to  the different datatype
    datatpe  that is not in its range  it will give runtime error
so first we need to be type caseted
*/