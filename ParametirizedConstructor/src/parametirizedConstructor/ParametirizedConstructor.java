package parametirizedConstructor;
class area{
	int length=20;
	int width=50;
	int area;
	area(int l, int w){  //Parameterized constructor
		length=l;
		width=w;
	}
	
	public int FindArea() {
		area=length*width;
		return area;
		
	}
	public void DisplayArea() {
		System.out.println("The area is "+area);
	}
}

public class ParametirizedConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		area obj = new area(40,10);
		obj.FindArea();
		obj.DisplayArea();

	}

}
