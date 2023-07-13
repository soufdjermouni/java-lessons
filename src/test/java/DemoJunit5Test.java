import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DemoJunit5Test {

    @Test
    //@Disabled("Not implemented yet")
    @DisplayName("Should demonstrate a simple assertion!")
    void souhlShowSimpleAssertion() {
        assertEquals(1,1);
    }

    @Test
    @DisplayName("Multiple assertios!")
    void mutipleAssertionOldMethod() {
        List<Integer> numbers = List.of(2,3, 5, 7);
        //Méthode classque
        assertEquals(1,numbers.get(0));
        assertEquals(3,numbers.get(1));
        assertEquals(5,numbers.get(2));
        assertEquals(7,numbers.get(3));

        // il echoue à la premère assertion, puis vérification s'arrête
        /**
         * org.opentest4j.AssertionFailedError:
         * Expected :1
         * Actual   :2
         */
    }

    @Test
    @DisplayName("Multiple assertios!")
    void runGroupAssertion() {
        List<Integer> numbers = List.of(2,3, 5, 7);

        //Run groupe or multiple assertions
        Assertions.assertAll(
                () -> assertEquals(1,numbers.get(0)),
                () -> assertEquals(1,numbers.get(1)),
                () -> assertEquals(1,numbers.get(2)),
                () -> assertEquals(1,numbers.get(3))
        );
        // il vérifie toutes les assetions
    }
}
