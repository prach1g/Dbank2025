public class WrongMonthException extends Exception {

    WrongMonthException()
    {
        super("month should be between 1 and 12");
    }
}
