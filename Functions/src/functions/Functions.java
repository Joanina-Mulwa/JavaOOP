package functions;
import java.util.Scanner;
public class Functions {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("Enter a");
		a=sc.nextInt();
		
		System.out.println("Enter b");
		b=sc.nextInt();
		
		int sum;
	
		sum=sum(a, b);
		
		System.out.println("The sum is "+sum);
		
		calculation();
		sc.close();
	}
	
	public static int sum(int a, int b) {
		int sum;
		sum=a+b;
		return sum;
		
	}
	
	public static void calculation() {
		System.out.println("This is a basic mathematics calculation");
	}
	
	
	

}

