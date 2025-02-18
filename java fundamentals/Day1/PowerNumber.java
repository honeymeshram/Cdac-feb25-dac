import java.util.Scanner;
class PowerNumber{
	public static void main(String args[]){
	
		Scanner obj = new Scanner(System.in);
		System.out.println("Input Base Number");
		int base=obj.nextInt();
		System.out.println("Input Exponent Number");
		int exponent=obj.nextInt();
		
		int ans=1;
		for(int i=1;i<=exponent;i++){
		
			ans=ans*base;
		}
		
		System.out.println(base+" raised to the power "+exponent+" is "+ans);

	}

}