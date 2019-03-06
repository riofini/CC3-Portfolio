package prices;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Prices {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double[] arr = new double[21];
       
       for (int i = 1; i < arr.length; i++) {
           System.out.print("ENTER PRICE " + i + ": $");
           arr[i] = sc.nextDouble();
       }
        System.out.println("");
        DecimalFormat f = new DecimalFormat("#0.00");
        System.out.println("PRICE SUM: $" + sum(arr));
        System.out.println("PRICE AVERAGE: $" + f.format(sum(arr)/arr.length));
        
        for (int k = 1; k < arr.length; k++) {
            if (arr[k] < 5.00) {
                System.out.println(">>>PRICE " + k + ": $"+ arr[k] + " IS LESS THAN $5.00!");
            }
        }
        
        for (int j = 1; j< arr.length; j++) {
            if (arr[j] < sum(arr)/arr.length) {
                System.out.println(">>>PRICE " + j + ": $" + arr[j] + " IS LESS THAN THE PRICE AVERAGE!");
            }
        }
    }
    
    public static double sum (double[] arr) {
        int sum = 0;
        
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
