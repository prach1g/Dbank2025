public class Student {
    private int roll;
    private String name;
    private MyDate dob; //Student has a property of MyDate

    public MyDate getDob() {
        return dob;
    }

    public void setDob(MyDate dob) {
        this.dob = dob;
    }

    public int getRoll() {
        return roll;
    }

    public Student(int roll, String name, MyDate dob) {
        this.roll = roll;
        this.name = name;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoll(int roll) {
        if(roll > 0)
        this.roll = roll;
        else
            System.out.println("illegal roll");
    }

    public Student()
    {

    }
    public Student(String n, int r){
        this.name=n;
        this.roll =r;
    }


}
