package testerFile;
import java.util.Scanner;

public class TesterFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the operator: "); 
		String operand = sc.nextLine();
        
		System.out.println("Enter the first operand:  "); 
		int operator1 = sc.nextInt();
		
		
		
		System.out.println("Enter the first operand2: "); 
		int operator2 = sc.nextInt();
		
		
		sc.close(); 
		
		System.out.println("Hello Server, Do the following calculation: ");
		String inputLine = " " + operator1 + " " + operand + " " +operator2;
		System.out.println(inputLine);

	}

}
