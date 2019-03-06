package rpg;

public class Wizard extends Character{
    int maxmagic;
    int currentmagic;

    public Wizard(String n, int s, int d, int i) {
        super(n, s, d, i);
        
        maxmagic = 1000;
        currentmagic = maxmagic;
    }
    
    public int castLightningBolt() {
        strength += intellegence;
        if (currentmagic >= 5) {
            int rand = dice.roll();
            rand += intellegence;
            currentmagic -= rand;
        }
        else {
            return 0;
        }
        return strength;
    }
    
    public int castHeal() {
        int rand = dice.roll();
        rand += intellegence;
        
        if (currentmagic >= 8) {
            currentmagic -= 8;
            heal(rand);
        }
        return rand;
    }
    
    public int getMaxMagic() {
        return maxmagic;
    }
    
    public int getCurrentMagic() {
        return currentmagic;
    }
}
