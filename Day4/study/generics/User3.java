package study.generics;

public class User3 {
    public static void main(String[] args) {
        GenericStack<Toy> g = new GenericStack<Toy>(new Toy[5]);
        g.push(new Toy("doll",300));
        g.push(new Toy("car",200));
        g.push(new Toy("pen",100));
        g.push(new Toy("lego",900));

        g.showStack();
    }
}


class Toy
{
    private String name;
    private double price;

    Toy(String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name+" "+price;
    }
}