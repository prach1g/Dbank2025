package study.generics;

//P is the Formal type parameter = PLACEHOLDER
public class GenericStack<P> {
    private int top;
    private P[] arr;

    GenericStack( P[] arr){
        this.top = -1;
        this.arr = arr;
    }
    public void showStack(){
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(i+" : "+arr[i]);
        }
    }
    public void push(P value){
        if(top<arr.length-1) {
            top++;
            arr[top] = value;
        }else System.out.println("Stack is full");
    }
    public P pop(){
        if(top<0){
            System.out.println("Stack is empty");
            return null;
        }else {
            P value = arr[top];
            arr[top--] = null;
            return value;
        }
    }


}//end of class

