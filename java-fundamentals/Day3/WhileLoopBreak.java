public class WhileLoopBreak { 
    public static void main(String[] args) { 
        int count = 0; // initital value is 0
        while (count < 5) {      //condition 
            System.out.print(count + " "); 
            count++; 
            if (count == 3) break;  //when count==3 use break and end execution of loop
	
        } 
       	 System.out.println(count);  //print count value

    } 
} 

/*
// Guess the output of this while loop.
		execution

	count  print coun   count++    if(count==3)
	0      print->0      0+1=1         false
	1      print->1      1+1=2         false
	2      print->2      2+1=3         true break the loop
			execution of loop stopped 

	and at end print the value of count that is 3

	output
        0 1 2 3
       line space
	

	

*/