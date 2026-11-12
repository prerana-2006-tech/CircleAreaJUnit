
package com.circle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircleAreaTest {

    CircleArea circle = new CircleArea();

    // Test Case 1: Positive radius
    @Test
    public void testPositiveRadius() {

        double result = circle.calculateArea(5);

        assertEquals(78.5398, result, 0.001);

        System.out.println("Test 1 Passed");
    }

    // Test Case 2: Zero radius
    @Test
    public void testZeroRadius() {

        double result = circle.calculateArea(0);

        assertEquals(0, result);

        System.out.println("Test 2 Passed");
    }

    // Test Case 3: Negative radius
    @Test
    public void testNegativeRadius() {

        assertThrows(
            IllegalArgumentException.class,
            () -> circle.calculateArea(-5)
        );

        System.out.println("Test 3 Passed");
    }

    // Test Case 4: Another positive radius
    @Test
    public void testAnotherRadius() {

        double result = circle.calculateArea(7);

        assertEquals(153.9380, result, 0.001);

        System.out.println("Test 4 Passed");
    }
}
