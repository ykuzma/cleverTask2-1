package ru.clevertec;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringTest {
    static StringUtils stringUtils;

    @BeforeAll
    static void initStringUtils() {
        stringUtils = new StringUtils();
    }

    @Test
    void isNumberPositiveTest() {
        assertTrue(stringUtils.isPositiveNumber("0.002"));
        assertFalse(stringUtils.isPositiveNumber("-0.005"));
    }
}
