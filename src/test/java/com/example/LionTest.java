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
    private List<String> expectedEatMeat;
    private boolean actualHasMane;
    private int actualKittens;
    private int expectedKittens;
    private List<String> actualEatMeat;


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

        this.actualHasMane = this.lion.doesHaveMane(this.sexLion);

        assertEquals(this.expectedHasMane, this.actualHasMane);
    }

    @Test
    public void testShouldKittensIsOne() throws Exception {

        this.actualKittens = this.lion.getKittens();
        this.expectedKittens = 1;

        assertEquals(this.expectedKittens, this.actualKittens);
    }

    @Test
    public void testShouldLionEatMeat() throws Exception {

        this.expectedEatMeat = new ArrayList<>();
        this.expectedEatMeat.add("Животные");
        this.expectedEatMeat.add("Птицы");
        this.expectedEatMeat.add("Рыба");

        this.actualEatMeat = this.lion.getFood();

        assertEquals(expectedEatMeat, this.actualEatMeat);

    }

}