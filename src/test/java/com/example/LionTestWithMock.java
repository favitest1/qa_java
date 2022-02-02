package com.example;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.List;

@RunWith(Parameterized.class)
public class LionTestWithMock extends TestCase {

    @Mock
    Feline feline = new Feline();

    private final String sexLion;
    private final boolean expectedHasMane;

    @Before
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    public LionTestWithMock(String sexLion, boolean expectedHasMane) {
        this.sexLion = sexLion;
        this.expectedHasMane = expectedHasMane;
    }

    @Parameterized.Parameters
    public static Object[] get1Sex() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void testShouldHasMane() throws Exception {
        Lion lion = new Lion(this.feline, this.sexLion);
        boolean actualHasMane = lion.doesHaveMane();
        assertEquals(this.expectedHasMane, actualHasMane);
    }

    @Test
    public void testShouldKittensIsOne() throws Exception {
        Mockito.when(feline.getKittens()).thenReturn(1);
        Lion lion = new Lion(feline, this.sexLion);
        int expectedKittens = 1;
        int actualKittens = lion.getKittens();
        assertEquals(expectedKittens, actualKittens);
    }

    @Test
    public void testShouldLionEatMeat() throws Exception {
        Mockito.when(feline.getFood(Mockito.anyString())).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Lion lion = new Lion(this.feline, this.sexLion);
        List<String> expectedEatMeat = List.of("Животные", "Птицы", "Рыба");
        List<String> actualEatMeat = lion.getFood();
        assertEquals(expectedEatMeat, actualEatMeat);
    }
}

