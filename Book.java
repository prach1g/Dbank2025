public class Book {

     String name;
     double cost;
     static String publication;
     public void display()  //hidden ref this=calling obj
     {
         System.out.println(this.name+" : "+this.cost);
         System.out.println(Book.publication);
     }

     public static void display2()
     {
        // System.out.println(this.name+" : "+this.cost);
         System.out.println(Book.publication);
     }


}