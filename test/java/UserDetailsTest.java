import UC10.UserDetails;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserDetailsTest {
    @Test
    public void firstNameHappy() {
        UserDetails userDetails = new UserDetails();
        boolean output = UserDetails.validateName("Omkar");
        assertEquals(true, output);
    }

    @Test
    public void firstNameSad() {
        UserDetails userDetails = new UserDetails();
        boolean output = UserDetails.validateName("omkar");
        assertEquals(false, output);
    }

    @Test
    public void lastNameHappy() {
        UserDetails userDetails = new UserDetails();
        boolean output = UserDetails.validateLastName("Dudhewar");
        assertEquals(true,output);
    }
    @Test
    public void lastNameSad() {
        UserDetails userDetails = new UserDetails();
        boolean output = UserDetails.validateLastName("dudhewar");
        assertEquals(false, output);
    }
    @Test
    public void phoneNumberHappy() {
        UserDetails userDetails = new UserDetails();
        boolean output = UserDetails.validatePhoneNumber("91 7020024533");
        assertEquals(true, output);
    }

    @Test
    public void phoneNumberSad() {
        UserDetails userDetails = new UserDetails();
        boolean output = UserDetails.validatePhoneNumber("abc");
        assertEquals(false, output);
    }

    @Test
    public void passwordHappy() {
        UserDetails userDetails = new UserDetails();
        boolean output = UserDetails.validatePassword("Omkar@12");
        assertEquals(true, output);
    }

    @Test
    public void passwordSad() {
        UserDetails userDetails = new UserDetails();
        boolean output = UserDetails.validatePassword("om@#!!!kar");
        assertEquals(false, output);
    }

    @Test
    public void emailHappy() {
        UserDetails userDetails = new UserDetails();
        boolean output = UserDetails.validateEMail("omkardudhewar@gmail.com");
        assertEquals(true, output);
    }

    @Test
    public void emailSad() {
        UserDetails userDetails = new UserDetails();
        boolean output = UserDetails.validateEMail("omkardudhewar#@.com");
        assertEquals(false, output);
    }
}
