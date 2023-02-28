// BluePrint or Template or Structure
// e.g PrintWriter (PascalCase)
// Noun
// methods , variables camelCase e.g getBalance
// method - verb
// Data Hiding - private
// Encapsulation - Binding Data and Methods into a Single unit and that unit is called class.
 class Student {
    // Instance Variables  of a Student class
    private int rollno;
    private String name;
    private String course;
    private double fees;
    private String collegeName ;

    public void validate(int rollno, double fees){
        if(rollno<=0 || fees<=0){
            System.out.println("Invalid Data ...");
            System.exit(0);

        }
    }

    /*
     * Constructor 
     * Constructor will call when u create an object.
     * Use of Constructor - it is use for initalize the instance variables
     * Every class has default constructor by default
     * 
     * Constructor Overloading...
     */

     Student(){
        
        collegeName= "RKGIT";
       // System.out.println("I am the default constrcutor..");
     }
    //  void Student(){
    //     System.out.println("I am a Method...");
    //  }
     // Param Constructor
     Student(int rollno, String name, String course, double fees){
        // Constructor Chaining 
        //Student();
        //this(); // Calling Default Constructor
        this.rollno = rollno * collegeName.length();
        this.name = name;
        
        this.course = course;
        this.fees = fees;
       
     }

   public void input(int rollno,String name, String course, double fees){
       validate(rollno, fees);
        // Shadow Problem
       // Instance Var = Local Var
       this.rollno= rollno;
       this.name = name;
       this.course = course;
       this.fees = fees;
    }
    void print(){
        // this - keyword - it has current calling object reference
        System.out.println(this.rollno);
        System.out.println(this.name);
        System.out.println(course); // this.course
        System.out.println(fees);
        System.out.println(collegeName);
    }

}
