package hu.tmx.junit.exampleTwo.service;

import hu.tmx.junit.UdemyJunitAlapokApplication;
import hu.tmx.junit.exampleTwo.dao.TestDao;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = UdemyJunitAlapokApplication.class)
class TestServiceTest {

    @Autowired
    TestService testService;

    @Test
    public void findGreatestNumber(){
        assertEquals(100, testService.findGreatest());
    }
}