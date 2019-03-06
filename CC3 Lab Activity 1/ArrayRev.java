package arrayrev;

import java.util.Scanner;

public class ArrayRev {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        
        for(int i = 0; i < arr.length; i++) {
            System.out.print("Enter an Integer: ");
            arr[i] = sc.nextInt();
        }
        int n = arr.length; 
        System.out.print("First to Last: ");
        for (int i=0; i<n; ++i) {
            System.out.print(arr[i]+" "); 
        }
         System.out.println("");
         System.out.print("Last to First: ");
            for (int k=4; k>=0; k--) {
                System.out.print(arr[k]+" ");
        }
            System.out.println("");
    }
    
}
