import java.util.Scanner;
class OddEven{
	public static void main(String args []){
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=obj.nextInt();
		if(num%2==0){
			System.out.println("The Number "+num+" Is Even");
		}else{
			System.out.println("The Number "+num+" Is Odd");

		}
	}
}