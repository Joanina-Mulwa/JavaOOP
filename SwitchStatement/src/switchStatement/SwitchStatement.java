package switchStatement;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=135;
		switch(age)
		{
		case 10:
		{
			System.out.println("I am a child aged 10 years");
			break;
		}
		case 18:
		{
			System.out.println("I am a teenager aged 18 years");
			break;
		}
		case 35:
		{
			System.out.println("I am an adult aged 35 years");
			break;
		}
		default:
		{
			System.out.println("Invalid age");
		}
		}
		
		System.out.println("Getting status by age");
	}

}

