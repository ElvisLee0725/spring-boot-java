import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Disabled
    @Test
    public void add() {
        Calculator calculator = new Calculator();
        int result = calculator.add(1, 2);
        assertEquals(3, result, "Add method has a problem");

        assertNotNull(result);
        assertTrue(result > 1);
    }

    @DisplayName("Test divide method")
    @Test
    public void divide() {
        Calculator calculator = new Calculator();

        assertThrows(ArithmeticException.class, () -> calculator.divide(1, 0));
    }
}