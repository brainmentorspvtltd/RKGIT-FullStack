class Emp{
    int count; // Lazy (Instance Variable)
    static int counter; // Eager (Class Variable)
    Emp(){
        count++;
        counter++;
        System.out.println("Count "+count+" Counter"+counter);
    }
}
public class StaticUse {
    public static void main(String[] args) {
        Emp e1 = new Emp();
        Emp e2 = new Emp();
        Emp e3 = new Emp();
    }
}
