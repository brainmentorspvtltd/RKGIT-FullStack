import java.util.Locale;
import java.util.ResourceBundle;

public class MessageReader {
    ResourceBundle bundle ;// by using this we can read properties file
    MessageReader(){
        Locale locale= new Locale("hi","IN");
        bundle = ResourceBundle.getBundle("messages",locale);
    }

    public String getMessage(String key){
        return bundle.getString(key);
    }

}
