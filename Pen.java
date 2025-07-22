public class Pen {

    //properties
    private String inkColor, brand;
    private double cost;

    //Constructor = called just after the object gets space heap
    //used to initialize the properties
    public Pen(){
        inkColor = "blue";
        brand="reynolds";
        cost=20.0;
    }


    //Non static functions
    public void displayInfo()
    {
        System.out.println("the "+inkColor+" pen of "+brand+" costs Rs"+cost);
    }

    public void write()
    {
        System.out.println("I am writing in "+inkColor);
    }

}//end of class
