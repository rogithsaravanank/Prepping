// import org.example.*;
package org.example;
import static org.junit.Assert.*;

import org.junit.Test;

public class SampleATest {
    @Test
    public void test(){
        int actual= new SampleA().add(10,10);
        int expected=20;
        assertEquals(expected,actual);
}

}
