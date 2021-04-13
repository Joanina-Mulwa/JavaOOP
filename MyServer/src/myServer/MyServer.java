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
		
			ServerSocket ss=new ServerSocket(6666);  
			Socket s=ss.accept();//establishes connection   
			ObjectInputStream dis=new ObjectInputStream(s.getInputStream());  
			String  str=(String)dis.readUTF();  
			System.out.println("message= "+str);  
			ss.close();  
			 

	}

}
