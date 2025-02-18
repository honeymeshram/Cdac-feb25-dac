import java.util.Scanner;
class PrimeNumber{
	public static void main(String args[]){
		Scanner obj = new Scanner(System.in);
		System.out.println("Input Number");
		int num=obj.nextInt();
		boolean b=true;
		for(int i=2;i<num;i++)
		{
			if(num%i==0){
				b=false;
				break;
				

			}
		}
		if(b){
			System.out.println("The Number "+num+" is Prime");
		}else{
			System.out.println("The Number "+num+" is Not Prime");
		}
	}
}