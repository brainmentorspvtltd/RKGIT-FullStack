interface X{
    int A = 10; // public static final int A = 10;
    void show();
    void disp();
}
interface Y{
    int A = 20;
    void show();
    void print();
}
interface Z extends X, Y{
    void output();
}
class Q implements Z{

    @Override
    public void show() {
       int r = X.A + Y.A ;
       System.out.println(r);
    }

    @Override
    public void disp() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'disp'");
    }

    @Override
    public void print() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'print'");
    }

    @Override
    public void output() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'output'");
    }

}
public class MultipleInheritance {
    
}
