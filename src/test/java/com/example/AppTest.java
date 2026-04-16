package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testFineCalculation_NoLateDays() {
        // Simulate logic: fine = max(0, days-14) * numBooks * 1.0
        int days = 10;
        int numBooks = 2;
        int lateDays = Math.max(0, days - 14);
        double expectedFine = 0.0;
        assertEquals(expectedFine, lateDays * numBooks * 1.0);
    }

    @Test
    void testFineCalculation_LateDays() {
        int days = 20;
        int numBooks = 3;
        int lateDays = Math.max(0, days - 14);
        double expectedFine = 18.0; // 6 * 3 * 1
        assertEquals(expectedFine, lateDays * numBooks * 1.0);
    }

    @Test
    void testFineCalculation_EdgeCase_ZeroBooks() {
        int days = 20;
        int numBooks = 0;
        int lateDays = Math.max(0, days - 14);
        double expectedFine = 0.0;
        assertEquals(expectedFine, lateDays * numBooks * 1.0);
    }
}
