package rpg;

import java.util.Random;

public class Dice {
    private Random r;
    
    public Dice() { 
        r = new Random();
    }
    
    public int roll() {
       int roll = r.nextInt(6) +1;
       return roll;
    }
}
