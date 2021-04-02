package multipleInheritance;
class Animal{
	public void eat() {System.out.println("Eating");}
}
class Dog{
	public void run() {System.out.println("Running");}
}
class Puppy extends Dog{
	public void walk() {System.out.println("walking");}
}



public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Puppy obj = new Puppy();
		obj.run();
		//obj.eat();
		obj.walk();

	}

}

