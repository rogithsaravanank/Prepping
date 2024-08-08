package org.example;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.example.junit.Java;
import org.example.junit.SpringBoot;
import org.junit.jupiter.api.Test;

public class CoursesTest {
    @Test
    public void testAssertTrue(){
        assertTrue(new Java().course());
    }
    @Test
    public void testAssertFalse(){
    assertFalse(new SpringBoot().course(),"Result should be false");
    }

}
