import static java.lang.System.out;
class Email{
    private Email(){}
    static void sendMail(){

    }
}
 class Emp{
    int count; // Lazy (Instance Variable)
    static int counter ; // Eager (Class Variable)
    static int getValueFromDB(){
        return 100;
    }
    static {
        counter = getValueFromDB();
       // System.out.println("I Will Call During Class Load...");
    }
    static{
        //System.out.println("I will run second...");
    }
    Emp(){
       // System.out.println("Cons Call");
        count++;
        counter++;
        //System.out.println("Count "+count+" Counter"+counter);
    }
}
public class StaticUse {
    public static void main(String[] args) {
        System.out.println(Emp.counter);
        Emp e = new Emp();
        e= null;
        //System s = new System();
        out.println(e.counter);
        //System.out.println(e.count);
        //System.out.println(Emp.counter);
        // A obj = new A();
        // obj.test();
        // A.test();
        // Emp e1 = new Emp();
        // Emp e2 = new Emp();
        // Emp e3 = new Emp();
    }
}
