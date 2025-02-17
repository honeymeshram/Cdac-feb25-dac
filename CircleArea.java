import java.util.*;
class CircleArea{
	public static void main(String args[]){
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter The Radius Of Circle");
		int radius=obj.nextInt();
		
		double area = Math.PI*radius*radius;
		System.out.println("The Area Of Circle is :"+area);

	}
}