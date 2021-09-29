package hu.tmx.junit.examlpeOne.service;

import hu.tmx.junit.UdemyJunitAlapokApplication;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = UdemyJunitAlapokApplication.class)
class BinarySearchSpringTest {

    @Autowired
    BinarySearchSpring binarySearchSpring;

    @Test
    public void getSearchedNumber(){
        assertEquals(3, binarySearchSpring.doBinarySearch(new int[]{}, 5));
    }

}