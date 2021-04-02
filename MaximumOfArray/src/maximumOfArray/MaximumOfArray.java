package maximumOfArray;

public class MaximumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age[]= {190,34,56,280};
		int i;
		int max=age[0];
		for(i=0;i<4;i++)
		{	
			if(age[i]>max)
			{
		max=age[i];
			}
		
		}
		System.out.println("The oldest person is "+max);

	}

}

