package testerFile;

class Multi extends Thread{  
public void run(){  
System.out.println("thread is running...");  
}  
}
public class TesterFile{
public static void main(String args[]){  
Multi t1=new Multi();  
t1.start();  
 }  
} 
