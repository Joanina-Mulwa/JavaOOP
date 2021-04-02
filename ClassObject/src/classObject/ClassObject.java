package classObject;

class details{
	//A class has properties and methods
	String name;//class property
	
	String reg;//class property
	
	int year;//class property
	
	public void learn() 
	{ 
		//class method
		System.out.println("I am a student who learns alot");
	}
}

public class ClassObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		details obj = new details();//instantiating the class or creating an object
		
		obj.name="Joanina";//accessing class members
		obj.reg="1310"; //Accessing class members
		obj.year=2019;  //Accessing class members
		System.out.println("I am "+obj.name+" reg no "+obj.reg+" year "+obj.year);
		obj.learn(); //calling the method
	}

}
