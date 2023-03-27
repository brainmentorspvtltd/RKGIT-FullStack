
/*
 * Encapsulation
 * Data Hiding
 */
public class Employee {
    private int id; // Instance Var
    private String name;
    private double salary;
    private EmployeeOperations employeeOperations;
    private Printing printing;
    Employee(int id , String name, double salary){
        // Instance Var = Local Var
        this.id = id;
        this.name = name;
        this.salary = salary;
        employeeOperations = new EmployeeOperations(this.salary);
        printing = new Printing();
    }
    
    

    public EmployeeOperations getEmployeeOperations() {
        return employeeOperations;
    }



    public void setEmployeeOperations(EmployeeOperations employeeOperations) {
        this.employeeOperations = employeeOperations;
    }



    public int getId() {
        return id;
    }


   


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public double getSalary() {
        return salary;
    }


    public void setSalary(double salary) {
        this.salary = salary;
    }


    public void print(){
        printing.printSalarySlip(this);
    }

}
