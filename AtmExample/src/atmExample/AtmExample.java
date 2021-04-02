package atmExample;
import java.util.Scanner;
public class AtmExample {
	static int option,balance=500,withdraw,deposit; 
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true)
		{
			WelcomeMenu();
				
		switch(option)
		{
		case 1:
		{
			deposit();
			//System.exit(0);
			break;
		}
		case 2:
		{
			withdraw();
			//System.exit(0);
			break;
		}
		case 3:
		{
			balance();
			//System.exit(0);
			break;
		}
		case 4:
		{
			System.out.println("Thank you for using our services");
			System.exit(0);
			break;
		}
		default:
			System.out.println("Invalid choice");
			break;
		}
		}

}

	private static void WelcomeMenu() {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println();
		System.out.println("Automated Teller Machine");
		System.out.println("1 for deposit cash");
		System.out.println("2 for withdraw cash");
		System.out.println("3 for check balance cash");
		System.out.println("4 for EXIT");
		option=sc.nextInt();

		
	}

	private static void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Enter the amount to be deposited");
		deposit=sc.nextInt();
		balance=balance+deposit;
		System.out.println(deposit+" has successfully been deposited to your account.");
		System.out.println("Your new account balance is "+balance);
			
	}

	private static void withdraw() {
		// TODO Auto-generated method stub
		
		System.out.println("Enter amount to be withdrawn");
		withdraw=sc.nextInt();
		if(balance>=withdraw)
		{
			balance=balance-withdraw;
			System.out.println("Collect your cash of "+withdraw);
			System.out.println("New balance is "+balance);
		}
		else
			{
			System.out.println("You have insufficient balance. please top up and try again");
			}
	}

	private static void balance() {
		// TODO Auto-generated method stub
		
		System.out.println("Your account balance is "+balance);
		
	}

	}