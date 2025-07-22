public class UserOfPen {
    public static void main(String[] args) {
        //Create space on the heap
        //keeps the reference in the Frame on the stack
        //reference has the address of the obj on heap
        Pen obj1 = new Pen();
        Pen obj2 = new Pen();

        obj1.displayInfo(); //objects are used to call func as they are non static
        obj2.displayInfo();

    }
}
