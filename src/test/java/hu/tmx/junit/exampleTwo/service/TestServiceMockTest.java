package hu.tmx.junit.exampleTwo.service;

import hu.tmx.junit.UdemyJunitAlapokApplication;
import hu.tmx.junit.exampleTwo.dao.TestDao;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@ExtendWith(MockitoExtension.class)
@ContextConfiguration(classes = UdemyJunitAlapokApplication.class)
public class TestServiceMockTest {

    @InjectMocks
    TestService testService;

    @Mock
    TestDao testDaoMock;

    @Test
    public void findGreatestNumber(){
        Mockito.when(testDaoMock.getData()).thenReturn(new int[] {2,4});
        assertEquals(4, testService.findGreatest());
    }

    @Test
    public void findGreatestNumberNoElements(){
        Mockito.when(testDaoMock.getData()).thenReturn(new int[] {});
        assertEquals(Integer.MIN_VALUE, testService.findGreatest());
    }

    @Test
    public void findGreatestNumberEqualsElements(){
        Mockito.when(testDaoMock.getData()).thenReturn(new int[] {2,2});
        assertEquals(2, testService.findGreatest());
    }
}
