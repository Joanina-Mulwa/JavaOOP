package test;
public class Test{
	public static void main (String [] args) {
		System.out.println("Hello World");
		int sleepTime = 5000;
		if(System.getProperty("natujenge.sleep.time") != null){
			sleepTime = Integer.parseInt(System.getProperty("natujenge.sleep.time"));
			}
		System.out.println("Sleeping for "+ sleepTime+ "ms");
		try {
			Thread.sleep(sleepTime);
			} 
		catch (Exception e) 
		{//TODO: handle exception}System.out.println("End of program");}}
		}
	}
}