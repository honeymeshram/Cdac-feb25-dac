import java.util.Scanner;
class SwapTwoNumbers{
	public static void main(String args[]){
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter First Number ");
		int a=obj.nextInt();
		System.out.println("Enter Second Number ");
		int b=obj.nextInt();
		System.out.println("Before Swapping :");
		System.out.println("First Number :"+a);
		System.out.println("Second Number :"+b);
		
		

		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping :");
		System.out.println("First Number :"+a);
		System.out.println("Second Number :"+b);

		
	
		
	}
}