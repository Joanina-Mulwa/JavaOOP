import java.util.Scanner;
import exampleAPI.ExampleAPI;
public class TestingAPI {

	public static void main(String[] args) {
		
		String url = "intructables.com";
		System.out.println("Socket: "+ url + ", is " +(ExampleAPI.isSocketOpen("instructables.com", 80) ? "open!" : "not open"));
		System.out.println(ExampleAPI.isSocketOpen("instructables.com", 80));
		
		ExampleAPI.calculation();
		//While taking inputs from the user
		System.out.println();
		

		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("Enter a");
		a=sc.nextInt();
		
		System.out.println("Enter b");
		b=sc.nextInt();
		
		int sum;
		int sub;
	
		sum=ExampleAPI.summation(a, b);
		sub=ExampleAPI.subtraction(a, b);
		
		System.out.println("The summation is "+sum);
		System.out.println("The Subtraction is "+sub);
		
		sc.close();
		
		//While inputing inputs directly
		System.out.println();
		System.out.println("When giving inputs directly, a is 50 and b is 10");
		System.out.println(ExampleAPI.subtraction(50, 10));
		System.out.println(ExampleAPI.summation(50, 10));

	}

}
