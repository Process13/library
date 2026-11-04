package main.unittest.fighter;

import java.util.Random;

public class Fighter {

    private final int lowerRange = 5;
    private final int upperRange = 15;

    public int getLowerRange() {
        return lowerRange;
    }

    public int getUpperRange() {
        return upperRange;
    }

    private int hp = 100;

    private Random random =  new Random();

    public int getHp() {
        return hp;
    }

    public void attack(){
        int damage = random.nextInt(lowerRange,upperRange);

        hp = hp - damage;
    }


}