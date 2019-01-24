package snowenterprise;

import java.io.*;
import java.text.DecimalFormat;

public class SnowEnterprise {
    
    public static char sal;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        SimpleEmployee emp = new SimpleEmployee();
        SimpleEmployee emp2 = new SimpleEmployee();
        
        System.out.print("Enter name: ");
        String n = br.readLine();
        System.out.print("Enter Weekly Gross: ");
        double gross = Double.parseDouble(br.readLine());
        SnowEnterprise snow = new SnowEnterprise();
        double nt = snow.netWeekly(gross);
        
        emp.setName(n);
        emp.setWeeklyGross(gross);
        DecimalFormat formatter = new DecimalFormat("#0.00");
        
        System.out.print("\n*****SNOW ENTERPRISES*****\n");
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Gross Salary: " + (formatter.format(emp.getWeeklyGross())));

        System.out.println("Net Weekly Salary: " + (formatter.format(nt)));
        System.out.println("Classification: " + emp.getClassification());
        
        System.out.print("\n*******Problem 2*******\n");
        emp.setName("Marie");
        emp.setWeeklyGross(10000);
        emp.setClassification('B');
        
        emp2.setName("John");
        emp2.setWeeklyGross(20000);
        emp2.setClassification('D');
        
        System.out.println("Name: " + emp.getName());
        System.out.println("Gross: " + emp.getWeeklyGross());
        System.out.println("Class: " + emp.getClassification());
        System.out.println("");
        System.out.println("Name: " + emp2.getName());
        System.out.println("Gross: " + emp2.getWeeklyGross());
        System.out.println("Class: " + emp2.getClassification());
    }
    
    public double netWeekly(double gross){
        SimpleEmployee emp = new SimpleEmployee();
        double netWeeklySalary = gross * emp.getBonusRate();
        double weeklyFull = netWeeklySalary + 1500;
        sal = classify(weeklyFull);
        emp.setClassification(sal);
        return weeklyFull;
    }
    
    public char classify(double net) {
       char[] cl = {'A','B','C','D','E','F'};
       double[] n = {1999, 2499, 2999, 3499, 3999, 99999999};
       int i;
       
       for(i = 0; i < n.length; i++) {
           if (net <= n[i])
               break;                        
    }
       return cl[i];
    }
}
