public class TestStudent {
    public static void main(String[] args) {
        int x;
        x = 10;
        String ram3 = "Ram"; // String Literal
        String ram2 = new String("Ram");
        Student ram;
        // ram is a reference variable of Student type.
        //ram = new Student();
        ram = new Student(1001, "Ram", "Java",9999);
        //ram.input(-1001,"ram", "JS",-9999);
        // ram.rollno = -1001;
        // ram.fees = -9999;
        ram.print();
        // Student shyam = new Student();
        // shyam.print();
        // new - keyword 
        // new is use to allocate a memory for Student
    }
}
