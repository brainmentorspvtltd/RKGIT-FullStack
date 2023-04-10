// 2nd use - prevent overriding
// 3rd use - prevent inheritance
final class MathTri{
    void sin(){

    }
    void cos(){

    }
}
//class ChildMath extends MathTri{}
class Loan{
    final void applyForLoan(){
        System.out.println("Loan Apply For Loan...");
    }
    void emi(){
        System.out.println("Generic Logic EMI ");
    }
}
// In Java We can't create a class without inheritance
// Object - God Class / Root Class
class T extends Object{
    int a;
    int b;
    final int E;
    final int G = 20;
    @Override
    public  int hashCode(){
        return 1;
    }
    T(){
        E = db();
    }
    void show(){
       // E = 90;
    }
    int db(){
        return 20;
    }
}

class AutoLoan extends Loan{
    // void applyForLoan(){

    // }
    @Override
    void emi(){
        super.emi(); // Calling Parent
        System.out.println("AutoLoan EMI Logic...");
    }
}
public class FinalUse {
    public static void main(String[] args) {
        final int q2[]  = {10,20,30};
        q2[0]=1111;
        final T t = new T();
        System.out.println("T is ");
        System.out.println(t);
        System.out.println(t.toString());
        t.a++;
        t.b++;
        //t=new T(); 
        AutoLoan loan = new AutoLoan();
        
        loan.emi();
        // 1st Use - To Make Constants
        final int MAX = 100; // Constant (ALL Caps)
        //MAX++;
        //MAX = 200;
    }
}
