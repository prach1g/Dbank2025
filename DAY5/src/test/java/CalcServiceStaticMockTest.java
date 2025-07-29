import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;


import org.example.CalcService;
import org.example.Calculator;
import org.junit.Test;


public class CalcServiceStaticMockTest {

    @Test
    public void testCalc() {
        //mock =  dummy object
        Calculator addServiceMock = mock(Calculator.class);
        //when  = stub = dummy function
        when(addServiceMock.add(11, 12)).thenReturn(23);

        CalcService calcService = new CalcService(addServiceMock);
        int result = calcService.calc(11, 12);

        assertEquals(23, result);
    }
}
