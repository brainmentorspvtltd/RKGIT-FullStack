// class scope - public - with in the package and outside the package access
// default scope - with in the package

// class cannot have - private and protected scope
// private - with in the class access
// private use with class members
// protected - with in the package and outside the package using inheritance.
// Encapsulation - Bind Data Variables + Methods e.g Class
// Good Encapsulation - private Data Variables + public Methods
// Data Hiding
 class Customer {
    // Members - default scope default
    // private int id; // with in the class
    // protected String name;
    // double balance;
    // Data Hiding
    // primary fields + secondary 
    private int id; // Instance Variable (When u create an object then comes in memory)
    private String name;
    private double balance;
    private String companyName;
    private String email;
    private String phone;
    private String city;
    private String country;

    {
        // DB Call
        // Init Block + Pre Constructor Call
        System.out.println("I am Init Block "+id + " "+name + " "+balance);
    }
    {
        System.out.println("Another Init Block....");
    }

    public int getId(){
        return id;
    }
    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
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
        System.out.println("Default Cons");
       // System.out.println("I am the Default Constrcutor");
    }
    Customer (int id, String name){
        this();
        System.out.println("Two Param Cons");
        this.id = id;
        this.name =name;
    }
    // Constructor Overloading
    Customer(int id, String name, double balance){
       // Employee();
        this(id, name); // calling default constructor
        System.out.println("Three Param Cons");
        // Instance Var = Local Var
        //this.id = id + companyName.length();
        this.id = id;
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

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return this.balance;
    }
}

