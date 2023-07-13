import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DemoTestDataDrivenTest {

    @ParameterizedTest
    @DisplayName("Should create sahpes with differents numbers of sides ")
    @ValueSource(ints = {3,4,5,8,14})
    void dataDrivenTestExample(int expectedNumberOfSides) {
        int myint = expectedNumberOfSides;
        //Ligne sera exécuter pour chauque valuer de tableau ints ds ValueSource
        assertEquals(expectedNumberOfSides, myint);
    }

    @Test
    void testExceptionThrow (){
        assertThrows(IllegalArgumentException.class, () -> anyException() );
    }

    private Object anyException() {
        throw new IllegalArgumentException();
    }

}
