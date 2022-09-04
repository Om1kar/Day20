package UC12;

import java.util.regex.Pattern;

public class UserRegistration {

    public static boolean ValidateFirstName(String firstName) {
        Pattern pattern = Pattern.compile("^[A-Z][a-zA-Z]{2,}$");
/*		Regex to check valid username and compile the regex
		Pattern class contains matcher() method to find matching between given username
		and regular expression.*/
        if(pattern.matcher(firstName).matches()){
            return true;
        }else
            throw new UserRegistrationException("Invalid First Name ", UserRegistrationException.ExceptionType.INVALID_FIRST_NAME);

//		Return happy if the firstname matched the Regex
    }
    public static boolean ValidateLastName(String lastName) {
        Pattern pattern = Pattern.compile("^[A-Z][a-zA-Z]{2,}$");
        if(pattern.matcher(lastName).matches()){
            return true;
        }else
            throw new UserRegistrationException("Invalid Last Name ", UserRegistrationException.ExceptionType.INVALID_LAST_NAME);
    }
    public static boolean ValidatePhoneNo(String phoneNo) {
        Pattern pattern = Pattern.compile("^[0-9]{1,2} \\d{10}$");
        if(pattern.matcher(phoneNo).matches()){
            return true;
        }else
            throw new UserRegistrationException("Invalid Phone number ", UserRegistrationException.ExceptionType.INVALID_PHONE_NUMBER);
    }
    public static boolean ValidateEmail(String email) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?");
        if(pattern.matcher(email).matches()){
            return true;
        }else
            throw new UserRegistrationException("Invalid Email address ", UserRegistrationException.ExceptionType.INVALID_EMAIL);
    }
    public static boolean ValidatePassword1(String password1) {
        Pattern pattern = Pattern.compile("^[a-zA-z0-9]{8,}$");
        if(pattern.matcher(password1).matches()){
            return true;
        }else
            throw new UserRegistrationException("Invalid Password1 ", UserRegistrationException.ExceptionType.INVALID_PASSWORD);
    }
    public static boolean ValidatePassword2(String password2) {
        Pattern pattern = Pattern.compile("^[A-Z][a-zA-Z0-9]{7,}$");
        if(pattern.matcher(password2).matches()){
            return true;
        }else
            throw new UserRegistrationException("Invalid Password2 ", UserRegistrationException.ExceptionType.INVALID_PASSWORD);
    }
    public static boolean ValidatePassword3(String password3) {
        Pattern pattern = Pattern.compile("^[A-Z][a-zA-Z1-9]{6,}[1-9]$");
        if(pattern.matcher(password3).matches()){
            return true;
        }else
            throw new UserRegistrationException("Invalid Password3", UserRegistrationException.ExceptionType.INVALID_PASSWORD);
    }
    public static boolean ValidatePassword4(String password4) {
        Pattern pattern = Pattern.compile("^[A-Z][a-zA-Z1-9]{5,}[@$^][1-9]+$");
        if(pattern.matcher(password4).matches()){
            return true;
        }else
            throw new UserRegistrationException("Invalid Password4", UserRegistrationException.ExceptionType.INVALID_PASSWORD);
    }
    public static boolean EmailValidate(String email) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?");
        return pattern.matcher(email).matches();
    }

    public static void main(String[] args) {
//		calling methods and printing boolean value whether pattern matches given info
        System.out.println(ValidateFirstName("Omkar"));
        System.out.println(ValidateLastName("Dudhewar"));
        System.out.println(ValidatePhoneNo("91 7020024533"));
        System.out.println(ValidateEmail("omkardudhewar121@gmail.com"));
        System.out.println(ValidatePassword1("omkar123"));
        System.out.println(ValidatePassword2("Omkar123"));
        System.out.println(ValidatePassword3("Omkardudhewar1"));
        System.out.println(ValidatePassword4("Omkar$1"));
        System.out.println(EmailValidate("omkardudhewar121@yahoo.co.in"));
    }
}
