package com.example;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.List;


@RunWith(Parameterized.class)
public class LionTest extends TestCase {

    private Feline feline = new Feline();
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
        Lion lion = new Lion(this.feline, this.sexLion);
        boolean actualHasMane = lion.doesHaveMane();
        assertEquals(this.expectedHasMane, actualHasMane);
    }

    @Test
    public void testShouldKittensIsOne() throws Exception {
        Lion lion = new Lion(this.feline, this.sexLion);
        int actualKittens = lion.getKittens();
        int expectedKittens = 1;
        assertEquals(expectedKittens, actualKittens);
    }

    @Test
    public void testShouldLionEatMeat() throws Exception {
        Lion lion = new Lion(this.feline, this.sexLion);
        List<String> expectedEatMeat = List.of("Животные", "Птицы", "Рыба");
        List<String> actualEatMeat = lion.getFood();
        assertEquals(expectedEatMeat, actualEatMeat);
        System.out.println(lion.doesHaveMane());
    }

}