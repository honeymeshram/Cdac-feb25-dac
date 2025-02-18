public class Confusion { 
    public static void main(String[] args) { 
        int value = 2; 
        switch(value) { 
            case 1: 
                System.out.println("Value is 1"); 
		break;
            case 2: 
                System.out.println("Value is 2");
		break; 
            case 3: 
                System.out.println("Value is 3"); 
		break;
            default: 
                System.out.println("Default case"); 
		break;
        } 
    } 
} 

/*
	 Error to Investigate: Why does the default case print after "Value is 2"? How can 	you prevent the program from executing the default case?

	there is not break; statement after the case 2. when the given value matches case 2 
	it gets printed the statement up to default because there is no break statement.

	to prevent it we need to use break statement so that it can not print default case and come out from switch .

*/