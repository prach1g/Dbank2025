
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       /*
        Book b1 = new Book();
        Book b2= new Book();
        b1.name= "learning java";
        b1.cost = 300;
        b2.name ="easy react";
        b2.cost=200;
        Book.publication = "DB Publication";

        b1.display();
        b2.display();
*/

        Complex one  = new Complex(100,2);
        Complex two = new Complex(300,3);
        Complex result = one.add(two);
          //sout old value of one
          one.addToSelf(two);
          //sout new value of one
          //System.out.println("result="+result.real+" + "+result.im+"i");
    }

}