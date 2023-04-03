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
abstract class Account{
    int id;
    String name;
    double balance;
    Account(){
        System.out.println("Account class Cons");
    }
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
    abstract void roi(); // Bodyless method
    // @Deprecated
    // void roi(){
    //     System.out.println("Generic ROI 2%");
    // }
}
class SavingAccount extends Account{
    SavingAccount(){
        super();
    }
    @Override
    void roi(){
        //super.roi();
        System.out.println("ROI for SA 4%");
    }
}
class CurrentAccount extends Account{
    @Override
    void roi(){
        System.out.println("ROI for CA 5%");
    }
    void noLimit(){
        System.out.println("CA No Limit of Trans");
    }
}
public class ISA {

    static void call(Account account){
        account.deposit();
        account.withDraw();
        account.checkBalance();
        account.roi();
        if(account instanceof CurrentAccount){
            ((CurrentAccount)account).noLimit(); // Downcasting
        }
    }
    public static void main(String[] args) {
        call(new SavingAccount());
        call(new CurrentAccount());
       // Account a = new Account();
    //    Account account = new SavingAccount(); // Upcasting
    //     //SavingAccount sa = new SavingAccount();
    //     account.deposit();
    //     account.withDraw();
    //     account.checkBalance();
    //     account.roi();

    //     account = new CurrentAccount();
    //     account.deposit();
    //     account.withDraw();
    //     account.checkBalance();
    //     account.roi();
       // account.noLimit();
    }
}
