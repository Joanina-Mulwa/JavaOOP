package abstraction;
abstract class ElectricityBill{
	//abstract method
	abstract double computeBill();
}
class Commercial extends ElectricityBill{
	@Override
	public double computeBill() {
		return 1.25*100;
	}
}
class Domestic extends ElectricityBill{
	@Override
	public double computeBill() {
		return 0.25*75;
	} 
}
public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Commercial obj = new Commercial();
		System.out.println("Commercial bill is "+obj.computeBill());
		Domestic obj2 = new Domestic();
		System.out.println("Domestic bill is "+obj2.computeBill());

	}

}