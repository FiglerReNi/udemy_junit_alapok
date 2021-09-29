package hu.tmx.junit.exampleOne.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
//Ha a resources-ban van
//@ContextConfiguration("/applicationContext.xml")
//Ha máshonnan kellene behúzni
@ContextConfiguration("/testContext.xml")
class BinarySearchSpringTest {

    @Autowired
    BinarySearchSpring binarySearchSpring;

    @Test
    public void getSearchedNumber(){
        assertEquals(3, binarySearchSpring.doBinarySearch(new int[]{}, 5));
    }

}