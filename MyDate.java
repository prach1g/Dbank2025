public class MyDate {
    private int day,month,year;

    public MyDate(){}
    public MyDate(int d, int m, int y) throws WrongMonthException
    {
        this.day =d;
        if(m>=1 && m<=12)
          this.month =m;
        else
            throw new WrongMonthException();
        this.year =y;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
