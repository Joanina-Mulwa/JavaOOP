package minimumOfArray;

public class MinimumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age[]= {100,990,35,99};
		int i;
		int min=age[0];
		for (i=0;i<age.length;i++)
		{
			if (age[i]<min)
			{
				min=age[i];				
			}
		}
		
		System.out.println("The youngest person is "+min);

	}

}

