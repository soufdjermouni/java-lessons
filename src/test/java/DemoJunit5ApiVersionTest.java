import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DemoJunit5ApiVersionTest {
    
    private static int API_VERSION = 9;
    @Test
    @DisplayName("Should only run the test if some criteria are met")
    void souhlShowSimpleAssertion() {
        //13 : api version dans le codebase
        Assumptions.assumeTrue(API_VERSION >10);
        assertEquals(1,1);
    }
}


