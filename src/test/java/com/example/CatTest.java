package com.example;

import junit.framework.TestCase;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class CatTest extends TestCase {

    private Feline feline = new Feline();
    private Cat cat = new Cat(feline);
    private String expectedSound;
    private List<String> expectedEatMeat;
    private String actualSound;
    List<String> actualFood;

    @Test
    public void testShouldSoundMyau() {

        this.expectedSound = "Мяу";

        this.actualSound = cat.getSound();

        assertEquals(this.expectedSound, this.actualSound);

    }

    @Test
    public void testShouldFeelineFood() throws Exception {

        this.expectedEatMeat = new ArrayList<>();
        this.expectedEatMeat.add("Животные");
        this.expectedEatMeat.add("Птицы");
        this.expectedEatMeat.add("Рыба");

        this.actualFood = cat.getFood();

        assertEquals(this.expectedEatMeat, this.actualFood);

    }

}