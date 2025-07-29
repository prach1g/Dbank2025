import org.example.Calculator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Calculator JUnit5 Tests")
public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    @DisplayName("Addition of two positive numbers")
    void shouldAddTwoNumbers() {
        assertEquals(5, calculator.add(2, 3), "2 + 3 should equal 5");
    }

    @Test
    @DisplayName("Division by zero throws exception")
    void shouldThrowWhenDivideByZero() {
        assertThrows(ArithmeticException.class,
                () -> calculator.divide(10, 0),
                "Expected exception when dividing by zero");
    }
}//end of class






