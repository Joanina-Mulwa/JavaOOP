package encapsulation;
import java.util.Scanner;



class Shape{
	   private String name;
	   public String getName() 
	   {
		   return name;
		   }
	   public void setName(String name) 
	   {
		   this.name=name;
		   }
	}

public class Encapsulation {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double fee = 60000;
		final double cutOff= 0.6;
		
		Shape obj = new Shape();
		obj.setName("Circle");
		System.out.println(obj.getName());
		
		Scanner sc = new Scanner (System.in);
		double requiredFee=cutOff * fee;
		int paidFee;
		int units;
		System.out.println("Enter the amount of fee the student has paid ");
		paidFee = sc.nextInt();
		System.out.println("Enter the number of units the student has done the cat ");
		units = sc.nextInt();
		if(paidFee>=requiredFee && units==7)
		{
			System.out.println("The student can apply for xamination leave ");
			
		}
		else
		{
			System.out.println("The student should take an aademic leave");
		}
		
		sc.close();
		

	}

}

