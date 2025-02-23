public class DecrementingLoop { 
    public static void main(String[] args) { 
        int total = 0; 
        for (int i = 5; i > 0; i--) { 
            total += i;       //here total = total + i
            if (i == 3) 
		continue;  //when i==3 it will go for next iteration
            total -= 1;   //here total = total -1
        } 
        System.out.println(total); 
    } 
} 

/*
// Guess the output of this loop.

		execution 
	
	i       total+=i     total-=1
	5        0+5=5	      5-1=4
        4        4+4=8        8-1=7
        3        7+3=10       skip
	2        10+2=12     12-1=11
	1	 11+1=12     12-1=11
	0>0 false stop

	so total will be 12 that's the output


*/