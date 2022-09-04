import UC_12.UserRegistration;
import UC_12.UserRegistrationException;
import org.junit.Assert;
import org.testng.annotations.Test;

public class UserRegistrationTest {
    Boolean result;
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        result = UserRegistration.ValidateFirstName("Omkar");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenFirstName_WhenImProper_ShouldReturnInvalidMessage() {
        try {
            UserRegistration.ValidateFirstName("omkar@1");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_FIRST_NAME, e.exceptionType);
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        result = UserRegistration.ValidateLastName("Dudhewar");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenLastName_WhenImProper_ShouldReturnInvalidMesage() {
        try {
            UserRegistration.ValidateLastName("Dudhewar@1");
        }catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_LAST_NAME, e.exceptionType);
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenProperEmailShouldReturnTrue() {
        result = UserRegistration.EmailValidate("omkardudhewar121@gmail.co.in");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenImProperEmailShouldReturnInvalidMessage() {
        try {
            UserRegistration.EmailValidate("omkardudhewar121.gmail.co.in1");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_EMAIL, e.exceptionType);
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenProperPhoneNumberShouldReturnTure() {
        result = UserRegistration.ValidatePhoneNo("91 7020024533");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenImProperPhoneNumberShouldReturnInvalidMessage() {
        try {
            UserRegistration.ValidatePhoneNo("99 123456789");
        }catch (UserRegistrationException e){
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_PHONE_NUMBER, e.exceptionType);
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenProperPassword1ShouldReturnTrue() {
        result = UserRegistration.ValidatePassword1("omkardudhe");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenImProperPassword1ShouldInvalidMessage() {
        try {
            UserRegistration.ValidatePassword1("Omkar1");
        }catch (UserRegistrationException e){
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_PASSWORD, e.exceptionType);
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenProperPassword2ShouldReturnTrue() {
        result = UserRegistration.ValidatePassword2("Omkardudhewar");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenImProperPassword2ShouldInvalidMessage() {
        try {
            UserRegistration.ValidatePassword2("Omkar1");
        }catch (UserRegistrationException e){
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_PASSWORD, e.exceptionType);
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void givenProperPassword3ShouldReturnTrue() {
        result = UserRegistration.ValidatePassword3("Omkarrdud1");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenImProperPassword3ShouldInvalidMessage() {
        try {
            UserRegistration.ValidatePassword3("Omkar");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_PASSWORD, e.exceptionType);
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void givenProperPassword4ShouldReturnTrue() {
        result = UserRegistration.ValidatePassword4("Omkar@121");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenImProperPassword4ShouldInvalidMessage() {
        try {
            UserRegistration.ValidatePassword4("Omkar123456");
        }catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_PASSWORD, e.exceptionType);
            System.out.println(e.getMessage());
        }
    }
}
