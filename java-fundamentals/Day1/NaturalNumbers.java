import java.util.Scanner;
class NaturalNumbers{
	public static void main(String args[]){
		Scanner obj = new Scanner(System.in);
		System.out.println("Input A Number ");
		int num=obj.nextInt();
		for(int i=1;i<=num;i++){
			System.out.print(i+" ");
		}
	}
}