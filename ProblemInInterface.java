interface Course{
    void enroll();
    public default void classAtt(){
        System.out.println("75% Att...");
    }
    void duration();
    void amount();

}
interface ScCourse{
    public default void classAtt(){
        System.out.println("85% Att...");
    }
    static void test(){

    }
}

interface TriMath{
   
    static void sin(){}
    static void cos(){}
}

class Eng implements Course, ScCourse{
    @Override
   public  void classAtt(){
    Course.super.classAtt();
    ScCourse.super.classAtt();
        System.out.println("80% Att...");
    }
    @Override
    public void enroll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'enroll'");
    }

    @Override
    public void duration() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'duration'");
    }

    @Override
    public void amount() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'amount'");
    }

}
// class Mgmt implements Course{

// }
public class ProblemInInterface {
    
}
