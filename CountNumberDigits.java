import java.util.Scanner;
class CountNumberDigits{
		public static void main(String args[]){
	
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter The Number");
		int num=obj.nextInt();
		
		int val=num;
		int count=0;
		while(num!=0){
			count++;
			num=num/10;
		
		}
		System.out.println("The Number "+val+" Has "+count+" Digits.");
	}
}