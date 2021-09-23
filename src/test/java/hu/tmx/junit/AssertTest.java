package hu.tmx.junit;

import hu.tmx.junit.exampleOne.MyMath;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AssertTest {

    Object object;
    int[] numbersArray1;
    int[] numbersArray2;

    @BeforeEach
    public void setUp(){
        object = new Object();
        int[] numbersArray1 = {1,2,3};
        int[] numbersArray2 = {1,2,3};
    }

    @Test
    public void test1(){
        assertEquals(1, 1);
    }

    @Test
    public void test2(){
        assertEquals(1, 2);
    }

    @Test
    public void test3(){
        boolean success = true;
        assertTrue(success);
    }

    @Test
    public void test4(){
        boolean success = false;
        assertFalse(success);
    }

    @Test
    public void test5(){
        boolean success = true;
        assertFalse(success);
    }

    @Test
    public void test6(){
        assertNotNull(object);
    }

    @Test
    public void test7(){
        assertNull(object);
    }

    @Test
    public void test8(){
        assertArrayEquals(numbersArray1, numbersArray2);
    }

    @AfterEach
    public void tearDown(){
        Object object = null;
        int[] numbersArray1 = null;
        int[] numbersArray2 = null;
    }
}
