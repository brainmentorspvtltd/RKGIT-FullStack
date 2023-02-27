enum Products{
    PIZZA, BURGER, DRINKS
}
public class IfElseSwitchCase {
    public static void main(String[] args) {
        int age = 20;
        
        if(age>=18){
            System.out.println("DL ....");
        }
        else{
            System.out.println("Minor...");
        }

        System.out.println("1. Pizza");
        System.out.println("2. Burger");
        System.out.println("3. Drinks");
        Products choice = Products.PIZZA;
        // int choice = 1;
        // final int PIZZA = 1;
        // final int BURGER = 2;
        final String PIZZA = "pizza";
        // equals
        String ch = "Pizza";
        switch(ch){
            case "Pizza":
            System.out.println("Rs 300");
        }
        switch(choice){
            case PIZZA:
            System.out.println("Rs 300");
            break;
            case BURGER:
            System.out.println("Rs 100");
            break;
            case DRINKS:
            System.out.println("Rs 80");
            break;
            default:
            System.out.println("Invalid Choice...");
        }
    }
}
