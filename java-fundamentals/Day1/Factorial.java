import java.util.Scanner;
class Factorial{
	public static void main(String args[]){
		Scanner obj= new Scanner(System.in);
		System.out.println("Input a Number ");
		int num=obj.nextInt();
		int ans=1;
		for(int i=1;i<=num;i++){
			 ans=ans*i;
		}
		System.out.println("Factorial of "+num+" is "+ans);
	}
}