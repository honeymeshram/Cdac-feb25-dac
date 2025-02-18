import java.util.Scanner;
class CelsiusToFahrenheit{
	public static void main(String args[]){
		Scanner obj = new Scanner(System.in);
		System.out.println("Input Temperature in celcius");
		int cel=obj.nextInt();
		 float feh = (((float)(cel * 9)/5) + 32);
		System.out.println(cel+"C is equal to "+feh);

	}
}