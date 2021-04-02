package singleInheritance;
class Animal{
	String name;
	public void eat()
	{
	System.out.println("The animal eats");	
	}
	
}
class Dog extends Animal{
	public void bark() {
		System.out.println("The dog barks");
	}
	
}
public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog obj = new Dog();
		obj.name="doggie";
		System.out.println("The name is "+obj.name);
		obj.bark();
		obj.eat();
	

	}

}

