package dynamicOverridingPolymorphism;
//Overriding is a principle that allows a derived class or a child class to provide a specific implementation of a method 
//that is already provided by one of its base class or parent class
class Summation{
	public int calculation(int a,int b) {
		int sum;
		sum=a+b;
		return sum;
		
	}
}
class Multiplication extends Summation{
	public int calculation(int a,int b) {
		int multiply;
		multiply=a*b;
		return multiply;
	}
} 
class Subtraction extends Summation{
	public int calculation(int a,int b) {
		int subtract;
		subtract=a-b;
		return subtract;
	}
} 
public class DynamicOverridingPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Summation obj;
		
		obj = new Summation();
		System.out.println(obj.calculation(20,10));
		
		obj = new Multiplication();
		System.out.println(obj.calculation(20,10));
		
		obj = new Subtraction();
		System.out.println(obj.calculation(20,10));
		

	}

}

