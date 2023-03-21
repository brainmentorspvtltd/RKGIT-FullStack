import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class Hint {
    public static void main(String[] args) {
        System.out.println("Enter the Id");
        
        // Hint - String class 
        Locale locale = new Locale("hi","IN");
        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
        double salary = 90000.20;
        String formattedSalary = nf.format(salary);
        System.out.println(formattedSalary);
        Date date = new Date();
        System.out.println(date);
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locale);
        String d = df.format(date);
        System.out.println(d);
    }
}
