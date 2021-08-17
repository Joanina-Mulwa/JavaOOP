package myServer;
import java.io.IOException;
import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
import java.lang.ClassNotFoundException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
//import java.io.*;  
//import java.net.*;  
public class MyServer {

	public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException, InterruptedException{
		
			//Instantiate ServerSocket class
			ServerSocket ss=new ServerSocket(6666);  
			
			//establishes connection 
			Socket s=ss.accept();  
			
			ObjectInputStream dis=new ObjectInputStream(s.getInputStream());  
			String  str=(String)dis.readUTF();  
			
			//Print out message
			System.out.println("message written by client is= "+str);  
			
			
			//Reversing the message
			StringBuilder input1 = new StringBuilder();
			 
	        // append a string into StringBuilder input1
	        input1.append(str);
	 
	        // reverse StringBuilder input1
	        input1.reverse();
	 
	        // print reversed String
	        System.out.println("reversed message written by client is= "+input1);
			
			
			
			ss.close();  
			 

	}

}
