/*
 * What is Overriding?
 * When you do Inheritance , so child recieve parent things.
 * so child has 2 options 
 * a) Use same.
 * b) do the override
 * Overriding only happen when there is IS A.
 * Overriding hide the parent version.
 * Overriding method signature should be same as parent.
 * Overriding means parent version is outdated. that's why we override in child
 */
class Account{
    int id;
    String name;
    double balance;
    @Deprecated
    void deposit(){
        System.out.println("Account Deposit...");
    }
    void withDraw(){
        System.out.println("Account WithDraw");
    }
    void checkBalance(){
        System.out.println("Account CheckBalance....");
    }
    @Deprecated
    void roi(){
        System.out.println("Generic ROI 2%");
    }
}
class SavingAccount extends Account{
    @Override
    void roi(){
        super.roi();
        System.out.println("ROI for SA 4%");
    }
}
class CurrentAccount extends Account{
    void roi(){
        System.out.println("ROI for CA 5%");
    }
    void noLimit(){
        System.out.println("CA No Limit of Trans");
    }
}
public class ISA {
    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount();
        sa.deposit();
        sa.withDraw();
        sa.checkBalance();
        sa.roi();

        CurrentAccount ca = new CurrentAccount();
        ca.deposit();
        ca.withDraw();
        ca.checkBalance();
        ca.roi();
        ca.noLimit();
    }
}
