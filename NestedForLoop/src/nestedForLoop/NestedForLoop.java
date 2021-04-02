package nestedForLoop;
import java.util.Scanner;
public class NestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* int i,j;
		for(i=0;i<=1;i++)
		{
			for(j=0;j<=1;j++)
			{
				System.out.println(i+" "+j);
			}
		}*/
		Scanner sc = new Scanner (System.in);
		int wk,count,pay,total=0;
		for(wk=1;wk<=3;wk++)
		{
			System.out.println("Pay for week "+wk);
			
			for(count=1;count<=3;count++)
			{
				System.out.println("Enter the pay for employee "+count);
				pay=sc.nextInt();
				total=total+pay;
				
			}
			
		}
		System.out.println("The total pay is "+total);
sc.close();
	}

}

