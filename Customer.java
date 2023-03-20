// class scope - public - with in the package and outside the package access
// default scope - with in the package

// class cannot have - private and protected scope
// private - with in the class access
// private use with class members
// protected - with in the package and outside the package using inheritance.
 class Customer {
    // Members - default scope default
    // private int id; // with in the class
    // protected String name;
    // double balance;
    // Data Hiding
    private int id; // Instance Variable (When u create an object then comes in memory)
    private String name;
    private double balance;
    private String companyName;
    // Constructor - Every class by default has default Constructor
    // Default Constructor it do nothing. It is empty by default
    /*
     * Constructor - It is same as class name.
     * Constructor will call when u create an object
     * Construcutor is used to initalize the instance variables
     * It not return anything.
     */
    Customer(){
        //this(1001, "Ram",22)
        companyName = "Amazon";
       // System.out.println("I am the Default Constrcutor");
    }
    // Constructor Overloading
    Customer(int id, String name, double balance){
       // Employee();
        this(); // calling default constructor
        // Instance Var = Local Var
        this.id = id + companyName.length();
        this.name = name;
        this.balance = balance;
    }
    public void takeInput(int id, String name, double balance){
        // Instance Var = Local Var
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    // ClassName - PascalCase - Standard
    public void print(){
        // that reference will be copy in a special keyword called this.
        // this - keyword - it contains the current calling object reference
        System.out.println("Id "+this.id);
        System.out.println("Name "+name);
        System.out.println("Balance "+balance);
        System.out.println("Company Name "+companyName);
    }  
}

