public class MissingBreakCase { 
    public static void main(String[] args) { 
        int level = 1; 
        switch(level) { 
            case 1: 
                System.out.println("Level 1"); 
		break;  //added afterwards
            case 2: 
                System.out.println("Level 2"); 
		break;  //added afterwards

            case 3: 
                System.out.println("Level 3"); 
		break;  //added afterwards

            default: 
                System.out.println("Unknown level"); 
		break;  //added afterwards

        } 
    } 
} 

/*
 Error to Investigate: When level is 1, why does it print "Level 1", "Level 2", "Level 3", and 
"Unknown level"? What is the role of the break statement in this situation? 

there is not break; statement after the case 1. when the given value matches case 1 
	it gets printed the statement up to default because there is no break statement.

	to prevent it we need to use break statement so that it can not print default case and come out from switch .


*/
