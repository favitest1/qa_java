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

    @Test
    public void testShouldEatMeatFeline() throws Exception {

        List<String> expectedEatMeat = List.of("Животные", "Птицы", "Рыба");

        List<String> actualEat = feline.eatMeat();

        assertEquals(expectedEatMeat, actualEat);

    }

    @Test
    public void testShouldFamilyisCats() {

        String expectedFamily = "Кошачьи";

        String actualFamilyis = feline.getFamily();

        assertEquals(expectedFamily, actualFamilyis);

    }

    @Test
    public void testShouldKittensIsOne() {

        int expectedKittensCount = 1;

        int actualKittens = feline.getKittens();

        assertEquals(expectedKittensCount, actualKittens);

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

        int actualKittens = feline.getKittens(kittensCount);

        assertEquals(expectedKittensCount, actualKittens);

    }

}