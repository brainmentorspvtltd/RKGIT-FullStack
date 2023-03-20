public class TestCustomer {
    public static void main(String[] args) {
        int e ;
        e = 10;
        e++;
        // customer it is a local variable (Scope with in the main)
        //Customer customer = new Customer();
        Customer customer = new Customer(1001, "Ram",2222);
       // customer.takeInput(1010, "Ram", 2222);
        customer.print(); // when u call a function with object reference
        // Customer customer2 = new Customer();
        // customer2.print();
        // customer.balance = -9999;
        // System.out.println(customer.id);
        // new - keyword - Memory Allocate During Runtime.
    }
}
