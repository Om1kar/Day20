import java.lang.constant.Constable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public static String ValidateFirstName(String firstName) {
        Pattern pattern = Pattern.compile("^[A-Z][a-zA-z0-9]{2,}$");

        if(pattern.matcher(firstName).matches()){
            return "Happy";
        }else
            return "Sad";
    }
    public static String ValidateLastName(String lastName) {
        Pattern pattern = Pattern.compile("^[A-Z][a-zA-z0-9]{2,}$");
        if(pattern.matcher(lastName).matches()){
            return "Happy";
        }else
            return "Sad";
    }
    public static String ValidatePhoneNo(String phoneNo) {
        Pattern pattern = Pattern.compile("^[0-9]{1,2} \\d{10}$");
        if(pattern.matcher(phoneNo).matches()){
            return "Happy";
        }else
            return "Sad";
    }
    public static String ValidateEmail(String email) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?");
        if(pattern.matcher(email).matches()){
            return "Happy";
        }else
            return "Sad";
    }
    public static String  ValidatePassword1(String password1) {
        Pattern pattern = Pattern.compile("^[a-zA-z0-9]{8,}$");
        if(pattern.matcher(password1).matches()){
            return "Happy";
        }else
            return "Sad";
    }
    public static String ValidatePassword2(String password2) {
        Pattern pattern = Pattern.compile("^[A-Z][a-zA-z0-9]{7,}$");
        if(pattern.matcher(password2).matches()){
            return "Happy";
        }else
            return "Sad";
    }
    public static String ValidatePassword3(String password3) {
        Pattern pattern = Pattern.compile("^[A-Z][a-zA-z1-9]{6,}[1-9]$");
        if(pattern.matcher(password3).matches()){
            return "Happy";
        }else
            return "Sad";
    }
    public static String ValidatePassword4(String password4) {
        Pattern pattern = Pattern.compile("^[A-Z][a-zA-z1-9]{5,}[@$^][1-9]{2}$");
        if(pattern.matcher(password4).matches()){
            return "Happy";
        }else
            return "Sad";
    }
    public static boolean ValidateEmailId(String email) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?");
        pattern.matcher(email).matches();
        return pattern.matcher(email).matches();
    }


    public static void main(String[] args) {
//		printing boolean value whether pattern matches given info
        System.out.println(ValidateFirstName("Omkar"));
        System.out.println(ValidateLastName("Dudhewar"));
        System.out.println(ValidatePhoneNo("91 7020024533"));
        System.out.println(ValidateEmail("omkardudhewar121@gmail.com"));
        System.out.println(ValidatePassword1("omkar123"));
        System.out.println(ValidatePassword2("Omkar123"));
        System.out.println(ValidatePassword3("OmkarrD1"));
        System.out.println(ValidatePassword4("Omkard@12"));
        System.out.println(ValidateEmailId("omkardudhewar121@gmail.co.in"));
    }
}
