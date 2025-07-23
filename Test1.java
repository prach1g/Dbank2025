public class Test1 {
    private int value=300;
    static int count = 400;

    public static void main(String[] args) {
        //increment value and count by 1
        //display value and count
        Test1 obj = new Test1();
        obj.value++;
        Test1.count++;

        count++;  //bcoz we  r in sm class

    }

}
