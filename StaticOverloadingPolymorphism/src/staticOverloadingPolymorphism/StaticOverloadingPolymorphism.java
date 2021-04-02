package staticOverloadingPolymorphism;
//Allows us to have more than one method with the same name but using different parameter lists
//should be in the same class
class Summation{
	public int calculation(int a,int b) {
		int sum;
		sum=a+b;
		return sum;
		}
	public int calculation(int c,int d, int e) {
		int multiply;
		multiply=c*d*e;
		return multiply;
	 	}
} 

public class StaticOverloadingPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Summation obj = new Summation();
		System.out.println(obj.calculation(10,10));
		System.out.println(obj.calculation(10,10,10));

	}

}

