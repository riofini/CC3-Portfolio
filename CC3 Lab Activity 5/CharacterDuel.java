package rpg;
import java.io.*;
public class CharacterDuel {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Wizard char1 = new Wizard("Merlin", 5, 20, 40);
        Assassin char2 = new Assassin("Hassan-i Sabbah", 5, 40, 20);
        
        int roundCount = 1;
            
            while (char1.getCurrentLife() != 0 || char2.getCurrentLife() != 0) {
                System.out.println(">>>ROUND " + roundCount);
                System.out.println(char1.name + ": " + char1.getCurrentLife());
                System.out.println(char2.name + ": " + char2.getCurrentLife());
                
                br.readLine();
                int atk1 = char1.castLightningBolt();
                
                if (char2.dodge(atk1) == 0) {
                    System.out.println(">>>" + char1.name + " ATTACKS "  + char2.name 
                        + " FOR " + atk1 + " but fails to land a hit!");
                }
                else {
                    System.out.println(">>>" + char1.name + " ATTACKS "  + char2.name 
                        + " FOR " + atk1);
                    char2.wound(atk1);
                }
                
                br.readLine();
                int atk2 = char2.visceralAttack();
                Dice dice = new Dice();
                int rand = dice.roll();
                
                if (char2.visceralAttack() != 0) {
                    System.out.println(">>>" + char2.name + " ATTACKS "  + char1.name 
                        + " FOR " + atk2);
                    
                    if (rand > 3) {
                        System.out.println(">>>" + char1.name + " CASTS a heal spell!" );
                        char1.castHeal();
                    }
                    else {
                        char1.wound(atk2);
                    }
                }
                else {
                    System.out.println(">>>" + char2.name + " ATTACKS "  + char1.name 
                        + " FOR " + atk2);
                    if (rand > 3) {
                        br.readLine();
                        System.out.println(">>>" + char1.name + " CASTS a heal spell!" );
                        char1.castHeal();
                    }
                    else {
                        char1.wound(atk2);
                    }
                }
                
                roundCount++;
                br.readLine();
                
                if (char1.getCurrentLife() <= 0) {
                    br.readLine();
                    System.out.println(">>>" + char2.name + " WINS!");
                    break;
                }
                else if (char2.getCurrentLife() <= 0) {
                    br.readLine();
                    System.out.println(">>>" + char1.name + " WINS!");
                    break;
                }
            }
            
    }
    
}
