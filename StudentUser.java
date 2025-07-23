public class StudentUser {
    public static void main(String[] args) throws WrongMonthException {
        //Student s = new Student("prachi",11);
        //s.roll=12;
        //s.setRoll(-32);
        //System.out.println(s.getName() +" "+s.getRoll());
        //CREATE student
        Student  s1 = new Student(10,"prateek",new MyDate(1,1,2000));

        //print name  and year of birth
        System.out.println(s1.getName());
        System.out.println(s1.getDob().getYear());

        //change the name to uppercase of current name
        //change the day of birth to 31
        //print  name ,roll , day-month-year
        String s = s1.getName();
        String upper = s.toUpperCase();
        s1.setName(upper);
        //s1.setName(s1.getName().toUpperCase());

        s1.getDob().setDay(31);

        System.out.println(s1.getName()+" "+s1.getRoll());
        MyDate d = s1.getDob();
        System.out.println(d.getDay()+"-"+d.getMonth()+"-"+d.getYear());







    }
}
