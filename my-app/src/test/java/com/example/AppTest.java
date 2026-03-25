package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testFactorial() {
        assertEquals(120, App.factorial(5));
    }

    @Test
    public void testPalindrome() {
        assertTrue(App.isPalindrome("madam"));
        assertFalse(App.isPalindrome("hello"));
    }
}
