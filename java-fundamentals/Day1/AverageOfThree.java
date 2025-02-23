import java.util.Scanner;
class AverageOfThree{
	public static void main(String args[]){
		Scanner obj = new Scanner(System.in);
		System.out.println("Input First Number");
		int num1=obj.nextInt();
		System.out.println("Input Second Number");
		int num2=obj.nextInt();
		System.out.println("Input Third Number");
		int num3=obj.nextInt();
		
		float result = (float)((num1+num2+num3)/3);
		System.out.println("The Average is :"+result);
	}
}