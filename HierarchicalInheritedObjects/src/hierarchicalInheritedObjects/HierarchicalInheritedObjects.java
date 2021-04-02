package hierarchicalInheritedObjects;
class Shape{
    String name;
    public String getName() {return name;}
    public void setName(String name) {this.name=name;}
}
class Circle extends Shape{
    public String getName(String name) {return name;}
    public void setName(String name) {this.name=name;}
        
}
class Triangle extends Shape{
    public String getName(String name) {return name;}
    public void setName(String name) {this.name=name;}
}
class Square extends Shape{
    public String getName(String name) {return name;}
    public void setName(String name) {this.name=name;}
    
}
public class HierarchicalInheritedObjects {

    public static void main(String[] args) {
        //created objects
        Shape obj;
         obj=new Triangle();
        obj.setName("T1");
        System.out.println("The name of the Triangle is: "+obj.getName());
      obj= new Circle();
        obj.setName("C1");
        System.out.println("The name of the Circle is: "+obj.getName());

        obj=new Square();
        obj.setName("S1");
        System.out.println("The name of the Square is: "+obj.getName());
    }
}

