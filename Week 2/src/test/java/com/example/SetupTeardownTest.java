package com.example;

import org.example.Calculator;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class SetupTeardownTest {

    private Calculator calc;

    @Before
    public void setUp() {
        calc = new Calculator();
        System.out.println("Setting up Calculator before test...");
    }

    @After
    public void tearDown() {
        System.out.println("Cleaning up after test...");
    }

    @Test
    public void testAddition() {
        int result = calc.add(7, 3);
        assertEquals(10, result);
    }

    @Test
    public void testMultiplication() {
        int result = calc.multiply(5, 2);
        assertEquals(10, result);
    }
}
