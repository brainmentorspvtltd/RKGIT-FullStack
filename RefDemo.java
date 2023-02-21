class Emp{
    @Override
    public int hashCode(){
        return 1;
    }
}
public class RefDemo extends Object {
    public static void main(String[] args) {
        String x = "Ram".intern();
        String y = "Ram";
        String z = new String("Ram").intern(); // 2 or 1
        System.out.println(x==y);
        System.out.println(x==z);
        // Emp emp = new Emp();
        // System.out.println(emp);
        // String name3 = new String("Amit");
        // String name = "Amit";
        // name is just a Reference variable
        // String name2 = name;// Ref Copy
        // System.out.println(name==name2); // true
        // System.out.println(name.toString());
        // System.out.println(name2);
        // System.out.println(name == name3); // false
    }
}
