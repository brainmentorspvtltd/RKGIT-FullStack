

public class Printing {
    MessageReader messageReader = new MessageReader();
    public void printSalarySlip(Employee emp){
        System.out.println(messageReader.getMessage("id.label")+emp.getId());
        System.out.println(messageReader.getMessage("name.label")+emp.getName());
        System.out.println(messageReader.getMessage("salary.label")+emp.getSalary());
        System.out.println("Hra "+emp.getEmployeeOperations().hra());
        System.out.println("Da "+emp.getEmployeeOperations().da());
        System.out.println("TA "+emp.getEmployeeOperations().ta());
        System.out.println("MA "+emp.getEmployeeOperations().ma());
        System.out.println("PF "+emp.getEmployeeOperations().pf());
        System.out.println("GS "+emp.getEmployeeOperations().gs());
        System.out.println("Tax "+emp.getEmployeeOperations().tax());
        System.out.println("NS "+emp.getEmployeeOperations().ns());
    }
}
