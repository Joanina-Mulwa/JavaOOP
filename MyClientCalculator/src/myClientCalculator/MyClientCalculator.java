package myClientCalculator;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.ClassNotFoundException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
public class MyClientCalculator {

	public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException, InterruptedException{
		    
			//Instantiating Socket class
			Socket s=new Socket("localhost",6000);  
            
			System.out.println("Welcome Client!!!"); 
			
			//NOTE: THE COMMENTED SECTION, IS THE LINES OF CODE WHICH CAN BE USED IF YOU WANT TO :
			//Prompt the user to enter the operator, operand and operator respectively and separately
		/*	Scanner sc = new Scanner (System.in);
            System.out.println("Enter the operator: "); 
			String operand = sc.nextLine();
            
			System.out.println("Enter the first operand:  "); 
			float operator1 = sc.nextInt();
			
			System.out.println("Enter the second operator: "); 
			float operator2 = sc.nextInt();
			
			sc.close(); 
	
			System.out.println("Hello Server, Do the following simple math calculation: ");
			String lines = operator1 + " " + operand + " " +operator2;
			System.out.println(lines);
			String inputLine = lines;
		
			ObjectOutputStream dout=new ObjectOutputStream(s.getOutputStream());  
			dout.writeUTF(inputLine);
            
           */
		
			//Entering the whole math equation AT ONCE
			Scanner sc = new Scanner (System.in);
            System.out.println("Enter the input line "); 
            String line = sc.nextLine();
            String inputLine = line.replace("", " ").trim();
			
			ObjectOutputStream dout=new ObjectOutputStream(s.getOutputStream());  
			dout.writeUTF(inputLine);
			
			sc.close();
			dout.flush();  
			dout.close();  
			s.close(); 
			 

	}

}
