package defaultConstructor;
class details{
	String name;
	int age;
	public void student() {
		System.out.println("I am "+name+" and i am "+age+" years old" );
	}
}

public class DefaultConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//since the variables are not initialized, the compiler gives them the null or 0 depending on the data type
		details obj = new details();
		obj.student();

	}

}

