package com.example;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedTests {

    @Test
    @Order(2)
    public void testSecond() {
        System.out.println("Second Test");
    }

    @Test
    @Order(1)
    public void testFirst() {
        System.out.println("First Test");
    }

    @Test
    @Order(3)
    public void testThird() {
        System.out.println("Third Test");
    }
}
