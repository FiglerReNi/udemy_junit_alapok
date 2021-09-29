package hu.tmx.junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

public class ListTest {

    List list = Mockito.mock(List.class);

    @Test
    public void listSizeCheck(){
        when(list.size()).thenReturn(10);
        assertEquals(10, list.size());
        assertEquals(10, list.size());
    }

    @Test
    public void listSizeWithDifferentReturns(){
        when(list.size()).thenReturn(10).thenReturn(20);
        assertEquals(10, list.size());
        assertEquals(20, list.size());
        assertEquals(20, list.size());
    }

    @Test
    public void listSpecificElementReturnString(){
        when(list.get(0)).thenReturn("Test");
        assertEquals("Test", list.get(0));
        assertNull(list.get(1));
    }

    @Test
    public void listAnyElementReturnString(){
        when(list.get(Mockito.anyInt())).thenReturn("Test");
        assertEquals("Test", list.get(0));
        assertEquals("Test", list.get(1));
    }
}
