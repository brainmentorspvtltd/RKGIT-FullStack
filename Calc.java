import java.util.Calendar;
import java.util.Date;

public class Calc {
    public static void main(String[] args) {
        // java Calc 10 * 20
        // java Calc 10 + 20
        Date date = new Date();
        System.out.println(date);
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int year = c.get(Calendar.YEAR);
        System.out.println(year);
        System.out.println("Args Len "+args.length);
        int firstNumber = Integer.parseInt(args[0]);
        String operator = args[1];
        int secondNumber = Integer.parseInt(args[2]);
        
        
        // == vs equals
        int result = 0;
        if(operator.equals("x")){
            result = firstNumber * secondNumber;
        }
        else
        if(operator.equals("+")){
            result = firstNumber + secondNumber;
        }
        System.out.println(result);
    }
}
