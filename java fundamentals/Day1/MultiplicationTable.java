import java.util.Scanner;
class MultiplicationTable{
	public static void main(String args[]){
	
		Scanner obj = new Scanner(System.in);
	
		System.out.println("Enter The Number");
		int num=obj.nextInt();
	
		for(int i=0;i<11;i++){
			int res=num*i;
			System.out.println(num+" x "+i+" = "+res);
		}
	}
}