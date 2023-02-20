public class Add {
    public static void main(String[] args) {
        // String r = new String("Amit");
        // r.toUpperCase();
        int sum = 0;
        // Array Traverse
        for(int i = 0; i<args.length; i++){
            sum = sum + Integer.parseInt(args[i]);
        }
        System.out.println("Sum is "+sum);
    }
}
