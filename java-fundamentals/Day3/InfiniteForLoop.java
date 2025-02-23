public class InfiniteForLoop { 
    public static void main(String[] args) { 
     /*   for (int i = 0; i < 10; i--) {   
		//error for infinite time i--   //this loop will run infinite times
            System.out.println(i); 
        } 
	*/
	for (int i = 0; i < 10; i++) {      //this loop will run finite times
            //error solved i++
	System.out.println(i); 
        } 
    } 
} 
/* 
//Error to investigate: Why does this loop run infinitely? How should the loop control variable be adjusted? 

	The loop will run infinite times because the variable i having the value 0 and in	the increment/decrement part of for loop it is decrementing so value of i will always 	be the less than 10 and condition will always be true;

	To stop the loop to run infinite we have to change the decrement(i--) part to (i++)increment
*/