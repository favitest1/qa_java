package com.example;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.ArrayList;
import java.util.List;

@RunWith(Parameterized.class)
public class LionTest extends TestCase {

    private Feline feline = new Feline();
    private Lion lion = new Lion(feline);

    private final String sexLion;
    private final boolean expectedHasMane;

    public LionTest(String sexLion, boolean expectedHasMane) {
        this.sexLion = sexLion;
        this.expectedHasMane = expectedHasMane;
    }

    @Parameterized.Parameters
    public static Object[] get1Sex() {
        return new Object[][] {
                { "Самец", true},
                { "Самка", false},
        };
    }

    @Test
    public void testShouldHasMane() throws Exception {

        boolean actualHasMane = this.lion.doesHaveMane(this.sexLion);

        assertEquals(this.expectedHasMane, actualHasMane);
    }

    @Test
    public void testShouldKittensIsOne() throws Exception {

        int actualKittens = this.lion.getKittens();
        int expectedKittens = 1;

        assertEquals(expectedKittens, actualKittens);
    }

    @Test
    public void testShouldLionEatMeat() throws Exception {

        List<String> expectedEatMeat = List.of("Животные", "Птицы", "Рыба");

        List<String> actualEatMeat = this.lion.getFood();

        assertEquals(expectedEatMeat, actualEatMeat);

    }

}