package ru.clevertec;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringTest {

    @Test
    void isNumberPositiveTest() {
        assertTrue(StringUtils.isPositiveNumber("0.002"));
        assertFalse(StringUtils.isPositiveNumber("-0.005"));
    }
}
