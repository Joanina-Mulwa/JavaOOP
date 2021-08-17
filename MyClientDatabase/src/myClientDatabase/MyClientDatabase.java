package myClientDatabase;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.*;
import java.net.UnknownHostException;

public class MyClientDatabase {



String host = "192.168.137.240";
int port = 6666;
Socket s;


public MyClientDatabase(String hostname, int port){
    this.host = hostname;
    this.port = port;
}


public void connect() throws UnknownHostException, IOException{
    System.out.println("Attempting to connect to "+host+":"+port);
    s = new Socket(host,port);
    System.out.println("Connection Established");
}

public void readResponse() throws IOException{
    String userInput;
    BufferedReader stdIn = new BufferedReader(new InputStreamReader(s.getInputStream()));

    System.out.println("Response from server:");
    while ((userInput = stdIn.readLine()) != null) {
        System.out.println(userInput);
    }
}

public static void main(String arg[]){
    //Creating a SocketClient object
	String host = "192.168.137.240";
	int port = 6666;
	Client client =new Client(host,port);
    try {
    	//trying to establish connection to the server
    	
        client.accept();
        
        //if successful, read response from server
        client.readResponse();

    } catch (UnknownHostException e) {
        System.err.println("Host unknown. Cannot establish connection");
    } catch (IOException e) {
        System.err.println("Cannot establish connection. Server may not be up."+e.getMessage());
    }
}
}

    
