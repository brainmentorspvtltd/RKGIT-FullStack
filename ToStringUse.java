//@Table
class Customer{
    //@Id
    int id;
    @Override
    public String toString() {
        return "Customer [id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }
    String name;
    double balance;
    Customer(int id, String name , double balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    // @Override
    // public String toString(){
    //     return "Id "+id+" Name "+name+" Balance "+balance;
    // }
}
// BYTE CODE INJECTIONS
// class [PP{

// }
public class ToStringUse {
    public static void main(String[] args) {
        int a[][] =new int[3][3];
        System.out.println(a);
        Customer ram = new Customer(1001, "Ram", 22222);
        System.out.println(ram);
        int arr[] = {10,20,30};
        System.out.println(arr);
    }
}
