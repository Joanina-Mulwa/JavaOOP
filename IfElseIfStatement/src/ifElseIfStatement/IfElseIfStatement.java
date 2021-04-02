package ifElseIfStatement;

public class IfElseIfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=1118;
		if(age>=0 && age<18)
		{
			System.out.println("I am a child");
		}
		else if(age>=18 && age<120)
		{
			System.out.println("I am a teenager");
		}
		else
		{
			System.out.println("Invalid age");
		}
		
		System.out.println("Tests the status by age");

	}

}

