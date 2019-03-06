package salary;

import java.io.*;
import java.text.DecimalFormat;

public class Salary {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("ENTER THE FOLLOWING: \n"
                + ">>>Hourly Pay: $");
        double hourP = Double.parseDouble(br.readLine());
        
        System.out.print(">>>Regular Hours: ");
        int hourR = Integer.parseInt(br.readLine());
        
        System.out.print(">>>Overtime Hours: ");
        int hourO = Integer.parseInt(br.readLine());
        
        System.out.println("CALCULATING...");
        br.readLine();
        
        DecimalFormat f = new DecimalFormat("#0.00");
        System.out.println(">>>TOTAL OVERTIME: " + "$"+ f.format(overtimeCalc(hourR, hourP, hourO)));
    }
    
    public static double overtimeCalc (int hourR, double hourP, int hourO) {
        double overtimeT = ((hourR*hourP) + ((1.5*hourP)*hourO));
        return overtimeT;
    }
    
}
