package addition;

import com.lessons.designpattern.structurel.proxy.Calculator;
import com.lessons.designpattern.structurel.proxy.CalculatorImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {


    @Test
    public void testTestAddition(){
        // Arrange (Mise en place)
        Calculator calculator = new CalculatorImpl();
        int a = 5;
        int b = 3;

        // Act (Action)
        int result = calculator.add(a, b);

        // Assert (Assertion)
        assertEquals(8, result); // Vérifie que la somme est égale à 8
    }
}
