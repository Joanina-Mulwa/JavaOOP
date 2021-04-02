package hybridInheritance;
//Dog and puppy extends Animal. and child extends dog/puppy in this case Dog
class Animal{
	public void eat() {System.out.println("Eating");}
}
class Dog extends Animal{
	public void run() {System.out.println("Running");}
	}
class Puppy extends Animal  {
	public void sleep() {System.out.println("Sleeping");}
}
class Child extends Dog{
	public void walk() {System.out.println("Walking");}
} 


public class HybridInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj = new Child();
		obj.walk();
		obj.run();

	}

}

