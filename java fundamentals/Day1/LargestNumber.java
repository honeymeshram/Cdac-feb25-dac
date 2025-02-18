import java.util.Scanner;
class LargestNumber{
	public static void main(String args[]){
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter First Number");
		int num1=obj.nextInt();
		System.out.println("Enter Second Number");
		int num2=obj.nextInt();
		System.out.println("Enter Third Number");
		int num3=obj.nextInt();
		
		if(num1>=num2&&num1>=num3){
			System.out.println("The largest number is "+num1);
		}
		else if(num2>=num1&&num2>=num3){
			System.out.println("The largest number is "+num2);
		}
		else if(num3>=num1&&num3>=num2){
			System.out.println("The largest number is "+num3);
		}


	}
}