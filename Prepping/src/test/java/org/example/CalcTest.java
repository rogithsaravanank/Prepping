package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.junit.Calc;
import org.junit.jupiter.api.Test;

public class CalcTest {
    @Test
    public void test(){
        assertEquals(20, new Calc().add(10, 10));
    }
    
}
