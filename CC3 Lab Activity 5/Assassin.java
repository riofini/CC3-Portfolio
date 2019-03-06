package rpg;

public class Assassin extends Character{
    
    int additionalDex;
    
    public Assassin(String n, int s, int d, int i) {
        super(n, s, d, i);
        
        additionalDex = 5 + dice.roll();
    }
    
    public int visceralAttack() {
        int rand = dice.roll();
        int atk = 0;
        
        if (rand > 3) {
            dexterity += additionalDex;
            atk = strength + dexterity;
        }
        else {
            atk = 10 + dexterity;
        }
        return atk;
    }
    
    public int dodge(int atk) {
        int rand = dice.roll();
        
        if (rand > 3) 
            atk = 0;
        else
            return atk;
        return atk;
    }
}
