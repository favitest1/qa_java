package com.example;

import junit.framework.TestCase;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class CatTest extends TestCase {

    private Feline feline = new Feline();
    private Cat cat = new Cat(feline);

    @Test
    public void testShouldSoundMyau() {

        String expectedSound = "Мяу";

        String actualSound = cat.getSound();

        assertEquals(expectedSound, actualSound);

    }

    @Test
    public void testShouldFeelineFood() throws Exception {

        List<String> expectedEatMeat = List.of("Животные", "Птицы", "Рыба");

        List<String> actualFood = cat.getFood();

        assertEquals(expectedEatMeat, actualFood);

    }

}