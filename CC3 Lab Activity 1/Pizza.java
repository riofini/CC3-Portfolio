package pizza;

import java.io.*;
import javax.swing.*;

public class Pizza extends JFrame{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String repeats;
        String size;
        
        do {
            System.out.println("Enter Pizza Size: (S, M, L or X): ");
            size = br.readLine();
            
             if (!size.equalsIgnoreCase("S") && !size.equalsIgnoreCase("M") && !size.equalsIgnoreCase("L") && !size.equalsIgnoreCase("X")) {
                JOptionPane.showMessageDialog(null, "Invalid Pizza size!", "Invalid", JOptionPane.ERROR_MESSAGE);
                System.out.println("Invalid");
                
                System.out.println("Enter Pizza Size: (S, M, L or X): ");
                size = br.readLine();
            }
             
            if (size.equalsIgnoreCase("S")) {
            String s = "small";
            System.out.print("The price of the " + s + " pizza is $" + pizzaPrice(s) + ". ");
            System.out.println("Do you want to try again?");
            }
            else if (size.equalsIgnoreCase("M")) {
                String m = "medium";
                System.out.print("The price of the " + m + " pizza is $" + pizzaPrice(m) + ". ");
                System.out.println("Do you want to try again?");
            }
            else if (size.equalsIgnoreCase("L")) {
                String l = "large";
                System.out.print("The price of the " + l + " pizza is $" + pizzaPrice(l) + ". ");
                System.out.println("Do you want to try again?");
            }
            else if (size.equalsIgnoreCase("X")) {
                String x = "extra large";
                System.out.print("The price of the " + x + " pizza is $" + pizzaPrice(x) + ". ");
                System.out.println("Do you want to try again?");
            }
            repeats = br.readLine();
        }
        while (repeats.equalsIgnoreCase("y"));
        System.out.println("Have a nice day!");
    }
    
    public static double pizzaPrice(String s) {
        //returns prices based on size
        String[] size = {"small", "medium", "large", "extra large"};
        double[] price = {6.99, 8.99, 12.50, 15.00};
        int i;
        
        for (i = 0; i < size.length; i++) {
            if (s.equalsIgnoreCase(size[i]))
                break;
            //gets price based on size[] after matching it with String s
        }
        return price[i];
    }
}
