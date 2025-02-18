import java.util.Scanner;
class ReverseNumber{
	public static void main(String args[]){
	 	Scanner obj = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=obj.nextInt();
		int ans=0;
		int val=num;
		while(num!=0){
			int res=num%10;
			ans=ans*10+res;
			num=num/10;
		}	
		System.out.println("The reverse of "+val+ "is "+ans);
	}
}