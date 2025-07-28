package study.inheritance;
public class AbstractExample {

    public static void main(String[] args) {
           //Shape obj = new Shape();  //never use a new with abstract class
            Rectangle r = new Rectangle("rectangle",12,10);
            double a =r.area();
        System.out.println("area of rectangle is "+a);

        Shape  obj = new Rectangle("rectangle",13,10);
        System.out.println("area of rectangle is "+obj.area());

    }
}//end of class

abstract class  Shape
{
     private String description;



     public Shape(String description)
     {
         System.out.println("the shape constructor is called and it is initializing the shape object");
         this.description = description;
     }
     //concrete
     public void show(){
         System.out.println("the shape is "+description);
     }

     //abstract = I dont know the implementation logic here
     public abstract double area();

}// end of shape

class Rectangle extends Shape
{
    private double side1,side2;
    Rectangle(String description,double side1,double side2 )
    {
        super(description);
        this.side1 = side1;
        this.side2 = side2;
    }
    @Override
    public double area() {
        double area = side1*side2;
        return area;
    }
}

//CANNOT inherit from a final class
//class MyString extends String
class XYZ
{
    final void   f1()
   {
       System.out.println(" final function is called");
    }
}

class PQR  extends XYZ
{
   // void f1()
    {

    }
}














