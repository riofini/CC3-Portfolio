package rpg;

public class Character {
    static Dice dice = new Dice();
    
    String name;
    int strength;
    int dexterity;
    int intellegence;
    int currentlife;
    int maxlife = 100 + dice.roll();
    
    public Character(String n, int s, int d, int i) {
        this.name = n;
        this.strength = s;
        this.dexterity = d;
        this.intellegence = i;
        this.currentlife = maxlife;
    }
    
    public int attack() {
        int atk = dice.roll();
        atk += strength;
        return atk;
    }
    
    public void wound(int damage) {
        currentlife -= damage;
    }
    
    public void heal(int heal) {
        if (currentlife < maxlife) {
            currentlife += heal;
        }
        else {
            System.out.println(">>>" + name + "'s HP Maxed!");
        }
    }
    
    public String getName() {
        return name;
    }
    
    public int getStrength() {
        return strength;
    }
    
    public int getDexterity() {
        return dexterity;
    }
    
    public int getIntelligence() {
        return intellegence;
        
    }
    
    public int getCurrentLife() {
        return currentlife;
    }
    
    public int getMaxLife() {
        return maxlife;
    }
}
