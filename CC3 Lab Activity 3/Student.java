package showstudent;

public class Student {
    
    private static String ID;
    private static int credit;
    private static int points;
    private static double average;
    
    public Student(String ID, int credit, int points) {
        this.ID = ID;
        this.credit = credit;
        this.points = points;
    }
    
    public double average(int pts, int cred) {
        average = pts/cred;
        return average;
    }
    
    public String getID () {
        return ID;
    }
    
    public int getCredit() {
        return credit;
    }
    
    public int getPoints() {
        return points;
    }
    
    public double getAverage(int pts, int cred) {
        average = pts/cred;
        return average;
    }
}
