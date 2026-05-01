package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testSum() {
        int a = 10;
        int b = 20;
        assertEquals(30, a + b);
    }
}
