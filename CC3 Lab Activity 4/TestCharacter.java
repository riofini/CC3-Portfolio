package rpg;
import java.io.*;
public class TestCharacter {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Character char1 = new Character("Mordred", 5, 20, 20);
        Character char2 = new Character("King Arthur", 5, 20, 20);
        
        int roundCount = 1;
            
            while (char1.getCurrentLife() != 0 || char2.getCurrentLife() != 0) {
                System.out.println(">>>ROUND " + roundCount);
                 System.out.println(char1.name + ": " + char1.getCurrentLife());
                System.out.println(char2.name + ": " + char2.getCurrentLife());
                
                br.readLine();
                int atk1 = char1.attack();
                char2.wound(atk1);
                System.out.println(">>>" + char1.name + " ATTACKS "  + char2.name 
                        + " FOR " + atk1);
                br.readLine();
                int atk2 = char2.attack();
                char1.wound(atk2);
                System.out.println(">>>" + char2.name + " ATTACKS "  + char1.name 
                        + " FOR " + atk2);
                roundCount++;
                br.readLine();
                
                if (char1.getCurrentLife() <= 0) {
                    br.readLine();
                    System.out.println(">>>" + char2.name + " WINS!");
                    break;
                }
                else if (char1.getCurrentLife() <= 0) {
                    br.readLine();
                    System.out.println(">>>" + char1.name + " WINS!");
                    break;
                }
            }
            
    }
    
}
