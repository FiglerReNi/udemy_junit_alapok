package hu.tmx.junit.exampleTwo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class BusinessServiceImplAnnotationTest {

    @InjectMocks
    BusinessServiceImpl businessServiceImpl;

    @Mock
    DataService dataService;

    @BeforeEach
    public void setUp(){}

    @Test
    public void choseTheGreatestNumber(){
        when(dataService.retrieveAllData()).thenReturn(new int[]{24,15,3});
        assertEquals(24, businessServiceImpl.findTheGreatestFromAllData());
    }

    @Test
    public void choseTheGreatestNumberFromOneNumber(){
        when(dataService.retrieveAllData()).thenReturn(new int[]{15});
        assertEquals(15, businessServiceImpl.findTheGreatestFromAllData());
    }

    @Test
    public void choseTheGreatestNumberFromNoNumber(){
        when(dataService.retrieveAllData()).thenReturn(new int[]{});
        assertEquals(Integer.MIN_VALUE, businessServiceImpl.findTheGreatestFromAllData());
    }

    @AfterEach
    public void tearDown(){
        dataService = null;
    }
}
