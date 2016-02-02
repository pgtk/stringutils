package ru.edu.pgtk;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringCheckerTest {

    @Test
    public void testIsEmpty() throws Exception {
        assertFalse(StringChecker.isEmpty(" "));
        assertFalse(StringChecker.isEmpty("  "));
        assertTrue(StringChecker.isEmpty(""));
        assertFalse(StringChecker.isEmpty("test"));
    }

    @Test
    public void testIsBlank() throws Exception {
        assertTrue(StringChecker.isBlank(" "));
        assertTrue(StringChecker.isBlank("  "));
        assertTrue(StringChecker.isBlank(""));
        assertFalse(StringChecker.isBlank("test"));
    }

    @Test
    public void testIsNumber() throws Exception {
        assertFalse(StringChecker.isNumber(" "));
        assertFalse(StringChecker.isNumber("  "));
        assertFalse(StringChecker.isNumber(""));
        assertFalse(StringChecker.isNumber("test"));
        assertTrue(StringChecker.isNumber("123"));
        assertTrue(StringChecker.isNumber(" 123"));
        assertTrue(StringChecker.isNumber("123 "));
        assertFalse(StringChecker.isNumber("x123"));
        assertFalse(StringChecker.isNumber("1se33"));
    }
}