package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import junit.framework.TestCase;


@RunWith(MockitoJUnitRunner.class)
public class LionTestWithMock extends TestCase {

    @Mock
    private Lion lion;

    @Test
    public void testShouldHasMane() throws Exception {

        Mockito.when(lion.doesHaveMane("")).thenReturn(true);
        boolean actual = true;
        boolean expected = lion.doesHaveMane("");
        assertEquals(expected, actual);
    }

    @Test
    public void testAnyKittens() {
        Mockito.when(lion.getKittens()).thenReturn(1);
        int actual = 1;
        int expected = lion.getKittens();
        assertEquals(expected, actual);
    }

}
