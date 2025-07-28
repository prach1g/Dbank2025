package study.collections;

import java.util.*;

public class CollectionEx1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("red");
        list.add("blue");
        list.add("green");
        list.add("orange");
        list.add("purple");

        //A obj = new B(); Valid if B extends A  or B is indirectly a subclass of A
        CollectionEx1.addToCollection(list);

        System.out.println(list.get(2)); //Index based access
        //check if the element is in the list
        System.out.println(list.contains("reddish"));
        list.remove("red");

        List<String> li =  new ArrayList<>();
        // Arrays.asList("purple","magenta","yellow");
        li.add("purple");
        li.add("magenta");

       // list.addAll(li);
        li.addAll(list);

        //traverse the list
        for(int i=0;i<li.size();i++){
            System.out.println(li.get(i));
        }


    }//end of main

    static void addToCollection(Collection<String> col)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter element");
        String str = sc.nextLine();
        col.add(str);
    }




}//end of class
