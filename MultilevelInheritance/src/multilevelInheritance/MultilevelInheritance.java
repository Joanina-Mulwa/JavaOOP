package multilevelInheritance;
class Animal{
	public void eat() {System.out.println("Eating");}
}
class Dog extends Animal{
	public void run() {System.out.println("Running");}
	}
class Puppy extends Dog{
	public void sleep() {System.out.println("Sleeping");}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Puppy obj = new Puppy();
		obj.sleep();
		obj.run();
		obj.eat();

	}

}

