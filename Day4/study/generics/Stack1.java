package study.generics;

public class Stack1 {
    private int top;
    private String[] arr;

    Stack1(){
        top = -1;
        arr = new String[5];
    }

    Stack1( String[] arr){
        this.top = -1;
        this.arr = arr;
    }

    public void showStack(){
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(i+" : "+arr[i]);
        }
    }

    public void push(String value){
        if(top<arr.length-1) {
            top++;
            arr[top] = value;
        }else System.out.println("Stack is full");
    }

    public String pop(){
        if(top<0){
            System.out.println("Stack is empty");
            return null;
        }else {
            String value = arr[top];
            arr[top--] = null;
            return value;
        }
    }


}//end of class
