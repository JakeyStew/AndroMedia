package com.example.jake.andromedia;

public class RandomGen {

    public Integer getRandom(int max, int min){

        int random = (int) (Math.random()* max + min);
        return random;
    }
}
