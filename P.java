import java.util.Scanner;

class Emp{
    int id;
    String name;
    public Emp(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
}
public class P {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Id ");
        int id = s.nextInt();
        System.out.println("Enter the name");
        String name = s.nextLine();
        Emp e = new Emp(id, name);
    }
}
