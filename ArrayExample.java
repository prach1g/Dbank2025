public class ArrayExample {

    public static void main(String[] args) {
        //creating space for array on the heap
        //int [] arr = new int[3];
        //int[] arr = {200,210,220};   //Initialized array
        int [] arr = getArray();
        populateArray(arr);  // it is changing the array
        show(arr);

        int counter = 400;
        increment(counter);  // it is not changing in the counter
        System.out.println("after incerement counter is "+counter);

    }//end of main

    public static void increment(int x)
    {
        x++;

    }
    public static void populateArray(int[] x)
    {
        int temp=100;
        for(int index=0;index<x.length;index++)
              x[index]  = temp++;
    }
    public static int[] getArray()
    {
          int []  a  = new int[5];
          return a;
    }
    public static void show(int [] nums)
    {
        //traverse the array
        for(int index =0;index< nums.length;index++)
            System.out.println(nums[index]);  //subscript notation

    }

}//end of class
