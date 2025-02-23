public class ConditionalLoopOutput { 
    public static void main(String[] args) { 
        int num = 1; //num is initialized to 1
        for (int i = 1; i <= 4; i++) {     //loop will execute from 1 to 4
            if (i % 2 == 0) {      //checks if i mod 2 ==0 
                num += i;     //if true num=num+i
            } else { 
                num -= i;     //else num=num-i
            }  
        } 
        System.out.println(num);  //prints num value and control will move to next line
    } 
} 

/*
// Guess the output of this loop.
	
		execution
	i     if(i%2==0)   num+=i    else    num-=i
	
	1       no           --       yes   num=1-1=0
	2       yes       num=0+2=2   no      --
        3        no          --       yes    num=2-3=-1
	4       yes       num=-1+4=3  no       --
	5     condition false loop stop

      	at last output of num will be 3

	output
	3
	line space

*/