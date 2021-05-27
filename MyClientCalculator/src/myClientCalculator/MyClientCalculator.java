package myClientCalculator;
import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.lang.ClassNotFoundException;
//import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
//import java.io.*;  
//import java.net.*;
public class MyClientCalculator {

	public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException, InterruptedException{
		    
			//Instantiating Socket class
			Socket s=new Socket("localhost",6000);  
            
			System.out.println("Welcome Client!!!"); 
			
			//Prompting the user to enter the operator, operand and operator respectively
			Scanner sc = new Scanner (System.in);
            System.out.println("Enter the operator: "); 
			String operand = sc.nextLine();
            
			System.out.println("Enter the first operand:  "); 
			float operator1 = sc.nextInt();
			
			System.out.println("Enter the second operator: "); 
			float operator2 = sc.nextInt();
			
			sc.close(); 
	
			System.out.println("Hello Server, Do the following calculation: ");
			String lines = " " + operator1 + " " + operand + " " +operator2;
			System.out.println(lines);
			String inputLine = lines;
		
			ObjectOutputStream dout=new ObjectOutputStream(s.getOutputStream());  
			dout.writeUTF(inputLine);
            
			dout.flush();  
			dout.close();  
			s.close(); 
			 

	}

}
