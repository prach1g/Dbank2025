package study.generics;

import java.util.Scanner;

public class NeedForGenerics {
    public static void main(String[] args) {
        Object[] arr =  new Object[3];
        /*
        arr[0] = new Exception();
        arr[1] = new Thread();
        arr[2] = new Scanner(System.in) //int is converted to Integer , Integer ISA  Object
        */
        arr[0]="red";
        arr[1]="blue";
        arr[2]= new Thread();

        //Using the generalized Object array
        for(int i=0;i<arr.length;i++){
            if(arr[i] instanceof String) {
                String s = (String) arr[i];
                System.out.println(s.toUpperCase());
            }
            else
                System.out.println(arr[i]);
            //System.out.println( arr[i].toUpperCase());
        }
    }
}
