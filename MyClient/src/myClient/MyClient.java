package myClient;
import java.io.IOException;
//import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.ClassNotFoundException;
//import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
//import java.io.*;  
//import java.net.*;
public class MyClient {

	public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException, InterruptedException{
		    
			Socket s=new Socket("localhost",6666);  
			ObjectOutputStream dout=new ObjectOutputStream(s.getOutputStream());  
			dout.writeUTF("Hello Server");  
			dout.flush();  
			dout.close();  
			s.close();  
			 

	}

}
