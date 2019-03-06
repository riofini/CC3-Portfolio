package showstudent;

import java.io.*;
import java.text.DecimalFormat;

public class ShowStudent {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        
        System.out.print("ENTER THE FF: \n"
                + "STUDENT ID: ");
        String id = br.readLine();
        
        System.out.print("TOTAL CREDIT HOURS: ");
        int cred = Integer.parseInt(br.readLine());
        
        System.out.print("TOTAL POINTS: ");
        int pts = Integer.parseInt(br.readLine());
        
        Student stud = new Student(id, cred, pts);
        
        System.out.print(">>>PROCESSING... ");
        br.readLine();
        
        DecimalFormat f = new DecimalFormat("#0.00");
        
        System.out.println("CALCULATED VALS: \n"
                + "STUDENT ID: "+ stud.getID() + "\n"
                + "TOTAL CREDITS: " + stud.getCredit() + "\n"
                + "TOTAL POINTS: " + stud.getPoints() + "\n"
                + "AVERAGE: " + f.format(stud.getAverage(pts, cred)) + "\n");
        
    }
    
    
    
}
