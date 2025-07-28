package study.io;

import java.util.Scanner;

public class KBDInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //GO on accepting and printing till user enters finish
        while (true) {
            System.out.println("enter ");
            String s = sc.nextLine();
            if(s.equals("finish"))
                break;
            System.out.println(" you entered " + s);
        }
    }
}
