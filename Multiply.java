import java.util.Scanner;
class Multiply{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter First Number");
		int num1=sc.nextInt();
		
		System.out.println("Enter Second Number");
		int num2=sc.nextInt();
		
		int res=num1*num2;
		System.out.println("The Multiplication Is :"+res);
	}
}