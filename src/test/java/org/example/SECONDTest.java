package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SECONDTest {

    @Test
    public void testBooleanValues() {
        assertTrue(5 > 3, "5 is greater than 3, so this should be true");
        assertFalse(2 > 4, "2 is not greater than 4, so this should be false");
    }


}
