import java.util.Scanner;

public class TestCustomer {
    public static void main(String[] args) {
        int e ;
        e = 10;
        e++;
        // customer it is a local variable (Scope with in the main)
        //Customer customer = new Customer();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Id ");
        int id = scanner.nextInt(); //1001 \n
        System.out.println("Enter the Name");
        scanner.nextLine(); // eat \n from id
        String name = scanner.nextLine(); //ask name
        System.out.println("Enter the Balance ");
        double balance = scanner.nextDouble();
        //System.out.println(scanner.nextLine());
        Customer customer = new Customer(id, name, balance);
        customer.setBalance(customer.getBalance() + 1000);
        customer.setPhone("2122222");
        System.out.println(customer.getPhone());
       // customer.takeInput(1010, "Ram", 2222);
        customer.print(); // when u call a function with object reference
       

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the City");
        String city = s.next();
        System.out.println("City is "+city);
        s.close();
        scanner.close();
        // Customer customer2 = new Customer();
        // customer2.print();
        // customer.balance = -9999;
        // System.out.println(customer.id);
        // new - keyword - Memory Allocate During Runtime.
    }
}
