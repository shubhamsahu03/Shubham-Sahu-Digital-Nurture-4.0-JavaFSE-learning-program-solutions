package com.example;

import org.example.PerformanceTester;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;

public class PerformanceTesterTest {

    @Test
    public void testPerformTaskCompletesInTime() {
        PerformanceTester pt = new PerformanceTester();
        assertTimeout(Duration.ofMillis(200), pt::performTask);
    }
}
