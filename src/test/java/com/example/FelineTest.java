package com.example;

import junit.framework.TestCase;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class FelineTest extends TestCase {

    private Feline feline = new Feline();

    private int kittensCount;
    private int expectedKittensCount;
    private List<String> expectedEatMeat;
    private String expectedFamily;
    private List<String> actualEat;
    private String actualFamilyis;
    int actualKittens;

    @Test
    public void testShouldEatMeatFeline() throws Exception {

        this.expectedEatMeat = new ArrayList<>();
        this.expectedEatMeat.add("Животные");
        this.expectedEatMeat.add("Птицы");
        this.expectedEatMeat.add("Рыба");

        this.actualEat = feline.eatMeat();

        assertEquals(expectedEatMeat, this.actualEat);

    }

    @Test
    public void testShouldFamilyisCats() {

        this.expectedFamily = "Кошачьи";

        this.actualFamilyis = feline.getFamily();

        assertEquals(expectedFamily, this.actualFamilyis);

    }

    @Test
    public void testShouldKittensIsOne() {

        this.expectedKittensCount = 1;

        this.actualKittens = feline.getKittens();

        assertEquals(this.expectedKittensCount, this.actualKittens);

    }

    public FelineTest(int kittensKount, int expected) {
        this.kittensCount = kittensKount;
        this.expectedKittensCount = expected;
    }

    @Parameterized.Parameters
    public static Object[] getInt() {
        return new Object[][] {
                { 1, 1},
                { 2, 2},
                {-1, -1},
                {0, 0},
        };
    }

    @Test
    public void testShouldKittensIsNumber() {

        this.actualKittens = feline.getKittens(kittensCount);

        assertEquals(expectedKittensCount, this.actualKittens);

    }

}