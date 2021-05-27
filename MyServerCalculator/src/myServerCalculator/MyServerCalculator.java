package myServerCalculator;
import java.io.IOException;

import java.util.StringTokenizer;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
//import java.io.ObjectOutputStream;
import java.lang.*;
//import java.io.*;  
//import java.net.*;  
public class MyServerCalculator {

	public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException, InterruptedException{
		
			//Instantiate ServerSocket class
			ServerSocket ss=new ServerSocket(6000);  
			
			//establishes connection 
			Socket s=ss.accept();  
			
			System.out.println("Welcome Server!!!"); 
			
			//reading the value of the input string eg reading 4 + 4 among others
			ObjectInputStream dis=new ObjectInputStream(s.getInputStream());  
			String  str=(String)dis.readUTF();
            
			//The StringTokenizer class will divide the input line eg 4 + 4  as follows:
			//float operation1=4  float operation = +  float operation2=4
			StringTokenizer stringTokenizer = new StringTokenizer(str);
			float operation1 = Float.parseFloat(stringTokenizer.nextToken());
			System.out.print(" ");
			String operation = stringTokenizer.nextToken();
			System.out.print(" ");
			float operation2 = Float.parseFloat(stringTokenizer.nextToken());
			
			//Performing the calculations
			float result = 0;
			switch (operation) 
			{
			
            case "+":
            {
                result = operation1 + operation2;
                System.out.println("Hello Client, the result of your query is "+ result);
                break;
            }
            case "-":
            {
                result = operation1 - operation2;
                System.out.println("Hello Client, the result of your query is "+ result);
                break;
            }
            case "*":
            {
                result = operation1 * operation2;
                System.out.println("Hello Client, the result of your query is "+ result);
                break;
            }
            case "/":
            {
                result = operation1 / operation2;
                System.out.println("Hello Client, the result of your query is "+ result);
                break;
            }
            default:
            	System.out.println("OOOPS Client you have entered an Invalid Operator");
            	
        }
			
			ss.close();  	 

	}

}
