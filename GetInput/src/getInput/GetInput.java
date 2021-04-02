package getInput;
import java.util.Scanner;
public class GetInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner scan = new Scanner (System.in);
		
		String bestColor;
		System.out.println("What is your favourite color?");
		bestColor = scan.nextLine();
		System.out.println("Your best color is "+ bestColor);
		
		
		
		Scanner sc = new Scanner (System.in);
		int age;
		double pie;
		
		System.out.println("Enter the age: ");
		age = sc.nextInt();
		
		System.out.println("The default value of pie is : ");
		pie = sc.nextDouble();
		
		
		System.out.println("Default value of pie is "+pie+" and i knew this when i was aged  "+age+" years old");
		
		scan.close();
		sc.close();
		
		

	}

}

