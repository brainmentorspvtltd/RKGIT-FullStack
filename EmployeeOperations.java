

public class EmployeeOperations {
    private double salary;
    public EmployeeOperations(double salary){
        this.salary = salary;
    }
    public double hra(){
        return this.salary * 0.50;
    }
    public double da(){
        return this.salary * 0.20;
    }
    public double ta(){
        return this.salary * 0.40;
    }
    public double ma(){
        return this.salary * 0.25;  
    }
    public double pf(){
        return this.salary * 0.05;
    }
    public double gs(){
        return this.salary + this.hra()+this.da() + this.ta() + this.ma();
    }
    public double tax(){
        return this.gs() * 0.10;
    }
    public double ns(){
        return this.gs() - this.tax() - this.pf();
    }
}
