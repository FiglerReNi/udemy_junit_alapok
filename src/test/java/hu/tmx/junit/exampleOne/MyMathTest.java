package hu.tmx.junit.exampleOne;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {

    MyMath myMath;

    @BeforeAll
    public static void beforeClass(){
        System.out.println("Before");
    }

    @BeforeEach
    public void setUp(){
        System.out.println("BeforeEach");
        myMath = new MyMath();
    }

    @Test
    public void sumOfNumbersIsCorrect(){
        System.out.println("Test1");
        int result = myMath.sum(new int[]{1,2,3});
        assertEquals(6, result);
    }

    @Test
    public void sumOfOneNumber(){
        System.out.println("Test2");
        assertEquals(3, myMath.sum(new int[]{3}));
    }

    @AfterEach
    public void tearDown(){
        System.out.println("AfterEach");
        myMath = null;
    }

    @AfterAll
    public static void afterClass(){
        System.out.println("After");
    }
}