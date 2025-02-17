import java.util.Scanner;
class MultipleOperations{
	public static void main(String args[]){
	  Scanner obj =new Scanner(System.in);
	  System.out.println("Enter First Number :");
	  int num1=obj.nextInt();
          System.out.println("Enter Second Number :");
	  int num2=obj.nextInt();
		
	  int sum=num1+num2;
	  int sub=num1-num2;
	  int mul=num1*num2;
	  int div=num1/num2;
	  int mod =num1%num2;
		System.out.println(num1+" + "+num2+" = "+sum);
		System.out.println(num1+" - "+num2+" = "+sub);

		System.out.println(num1+" * "+num2+" = "+mul);

		System.out.println(num1+" / "+num2+" = "+div);
		System.out.println(num1+" mod "+num2+" = "+mod);

	}
}