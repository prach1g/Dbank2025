public class Complex {
    double real,im;
    final int x=10;

    public Complex()
    {

         this.real = 10;
         this.im=1.0;
    }

    public Complex(double r, double i)
    {

        this.real = r;
        this.im = i;
    }

    public Complex add(Complex x)
    {
        Complex sum = new Complex();
        sum.real = this.real + x.real;
        sum.im = this.im + x.im;
        return sum;
    }

    public boolean equals(Complex c)
    {
          //we compare this with c
        if(this.real == c.real && this.im == c.im)
            return true;
        else
            return false;

    }

    @Override
    public String toString() {
        String s = "real:"+this.real+" im:"+this.im;
        return s;
    }

    public void addToSelf(Complex x)//add to caller object
    {

    }

}//end of class
