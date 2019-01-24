package snowenterprise;

public class SimpleEmployee {
    
    private String Name;
    private double FixedSalary;
    private char Classification;
    private double WeeklySalary;
    private double BonusRate;
    
    public SimpleEmployee() {
        this.Name = "John";
        this.BonusRate = 0.085;
        this.FixedSalary = 1500.00;
        this.Classification = 'A';
        this.WeeklySalary = 20000;
    }
    
    public void setName(String empname) {
        this.Name = empname;
    }
    
    public void setWeeklyGross(double weeklysales) {
        this.WeeklySalary = weeklysales;
    }
    
    public void setClassification(char classif) {
        this.Classification = classif;
    }
    
    public String getName() {
        return this.Name;
    }
    
    public double getWeeklyGross() {
        return this.WeeklySalary;
    }
    
    public double getFixedSalary() {
        return this.FixedSalary;
    }
    
    public char getClassification() {
        return this.Classification;
    }
    public double getBonusRate() {
        return this.BonusRate;
    }
 }
