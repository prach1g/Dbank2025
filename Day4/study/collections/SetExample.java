package study.collections;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {

        Set<Double> set  = new HashSet<>();

        set.add(2.0);
        set.add(3.45);
        set.add(4.56);
        set.add(5.67);

        //we cant use traditional for loop , get(i) not available
        for(Double d:set){
            System.out.println(d);
        }
    }//end of main
}//end of class
