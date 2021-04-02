package nestedIfStatement;

public class NestedIfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=1;
		int weight=50;
		if (weight>=50 && weight<=100)
		{
			System.out.println("Im not a child");
			if (age>=18 && age<=120)
			{
				System.out.println("Im a teenager");
			}
		}
		System.out.println("I am neither a child nor an adult");

	}

}

