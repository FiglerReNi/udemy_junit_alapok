package hu.tmx.junit.exampleTwo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class BusinessServiceImplTest {

    BusinessServiceImpl businessServiceImpl;

    DataService dataService = Mockito.mock(DataService.class);

    @BeforeEach
    public void setUp(){
        businessServiceImpl = new BusinessServiceImpl(dataService);
    }

    @Test
    public void choseTheGreatestNumber(){
        when(dataService.retrieveAllData()).thenReturn(new int[]{24,15,3});
        assertEquals(24, businessServiceImpl.findTheGreatestFromAllData());
    }

    @AfterEach
    public void tearDown(){
        dataService = null;
    }
}