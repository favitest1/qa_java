package com.example;

import java.util.List;

public class Lion {

    private boolean hasMane;

    private Feline feline;

    public Lion (Feline feline) {
        this.feline = feline;
    }

    public boolean doesHaveMane(String sex) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самей или самка");
        }

        return hasMane;
    }

    public int getKittens() {
        return this.feline.getKittens();
    }

    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }

}
