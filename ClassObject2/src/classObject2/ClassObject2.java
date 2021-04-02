package classObject2;

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

public class ClassObject2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		short x = 10;
		x = (short) (x*5);
		
		System.out.println(x);
		
		Shape obj = new Shape();
		obj.setName("Circle");
		System.out.println(obj.getName());

	}

}

