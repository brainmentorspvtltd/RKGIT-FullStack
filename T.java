class Q {
    static void show(){
        System.out.println("Q Show...");
    }
}
class Q2 extends Q{
   // @Override
    static void show(){
        System.out.println("Q2 Show...");
    }
}
public class T {
    public static void main(String[] args) {
        Q.show();
        Q2.show();
        Q obj= new Q2();
        obj.show();
    }
}
