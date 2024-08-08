package org.example;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.fail;

import java.time.Duration;

import org.example.junit.Calc;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)//default is PER_METHOD
public class CalcTest {
    CalcTest(){
        System.out.println("COnstructor of CalcTest");
    }

    @BeforeEach
    public void before(){System.out.println("before each..");}

    @AfterEach
    public void after(){System.out.println("after each..");}

    @Test
    public void testAdd(){
        assertEquals(20, new Calc().add(10, 10));
    }
    
    @Test
    public void testSquare(){
        assertEquals(100, new Calc().square(10),()-> "Not a exepcted Output");
    }

    @Test
    public void testSquareAssertNotEquals(){
        assertNotEquals(10, new Calc().square(10),()-> "Not a Not a expected Output");
    }

    @Test
    public void testAssertThrows(){
        // int[] arr={1,2,4};
        int[] arr=null;
        assertThrows(NullPointerException.class,()->new Calc().sortCalc(arr));
    }

    @Test
    public void testAssertThrowsExactky(){
        // int[] arr={1,2,4};
        int[] arr=null;
        assertThrowsExactly(NullPointerException.class,()->new Calc().sortCalc(arr));
    }

    @Test
    public void testAssertNull(){
        // int[] arr={1,2,4};
        int[] arr=null;
        assertNull(arr,"It is not null");
    }

    @Test
    public void testAssertAll(){
        assertAll("Calc operations", ()-> assertEquals(100, new Calc().square(10),"Not a exepcted Output"),()-> assertEquals(20, new Calc().add(10, 10)));
        // fail();
    }

    @Test
    public void testAssertTimeOut(){
        int[] arr={1,2,34,32,2,2,2,2,24,4,3,34,34,43,3,43,43,434,34,34,34,3,43,4,34,3,4,34,34,3,43,4,34,34,3,43,4,5,45,46,46,4,64,6,45,3,54,5};
        assertTimeout(Duration.ofMillis(50), ()->new Calc().sortCalcTimeout(arr));
    }


}
