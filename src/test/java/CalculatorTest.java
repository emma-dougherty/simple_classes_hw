import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator(6, 5, 10.25, 2.5);
    }

    @Test
    public void canAdd() {
        assertEquals(11, calculator.add());
    }

    @Test
    public void canSubtract(){
        assertEquals(1, calculator.subtract());
    }

    @Test
    public void canMultiply(){
        assertEquals(30, calculator.multiply());
    }

    @Test
    public void canDivide(){
        assertEquals(4.1, calculator.divide(), 0.0);
    }
}